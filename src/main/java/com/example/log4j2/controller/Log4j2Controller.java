package com.example.log4j2.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




/**
 * 
 * https://www.baeldung.com/spring-boot-logging
 *
 */

@Controller
public class Log4j2Controller {

	private static final Logger log = LogManager.getLogger(Log4j2Controller.class);
	
	@RequestMapping(path = { "/", "/index" }, method = RequestMethod.GET)
	public String home(Model model){
		log.debug("/index");

		return "index";
	}



}