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
		//thứ tự ưu tiên từ cao xuống thấp
		log.trace("/index"); //code này ko hiển thị vì log level ở file Log4j2.xml
		log.debug("/index");
		log.info("/index");
		log.warn("/index");
		log.error("/index");
		log.fatal("/index");

		return "index";
	}



}