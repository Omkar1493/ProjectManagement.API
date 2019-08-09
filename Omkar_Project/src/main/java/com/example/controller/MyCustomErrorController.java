package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
@ComponentScan
@RestController
public class MyCustomErrorController implements ErrorController {

	@RequestMapping("/error")
	@ResponseBody
	public String handleError(HttpServletRequest request) {
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
		return String.format("<html><body><h2>Error Page</h2><div>Status Code: <b>%s</b></div>"+ "<div>Exception Message: <b>%s</b></div><body></html>",statusCode,exception==null? "N/A": exception.getMessage());
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
}
