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
	
	/**
	 * "console": là tên appenders
	 * neu ko tim thấy tên thì nó sẽ gan cho Root appender
	 */
	private static final Logger log = LogManager.getLogger(Log4j2Controller.class); // %c = package name
	
	//neu ko tim thay ten "logger1" ở log4j2.xml => thì log nay sẽ ghi ra "root" logger
	private static final Logger fileLogger1 = LogManager.getLogger("logger1"); // c% =c%{1} = c%{2}= "logger1"
	
	//neu ko tim thay ten "logger2" ở log4j2.xml => thì log nay sẽ ghi ra "root" logger
	private static final Logger fileLogger2 = LogManager.getLogger("logger2"); // c% =c%{1} = c%{2}= "logger2"
	
	@RequestMapping(path = { "/", "/index" }, method = RequestMethod.GET)
	public String home(Model model){
		//thứ tự ưu tiên từ cao xuống thấp
		log.trace("/index trace"); //code này ko hiển thị vì log level ở file Log4j2.xml
		log.debug("/index debug");
		log.info("/index info");
		log.warn("/index warning");
		log.error("/index error");
		log.fatal("/index fatal");
		
		//
		fileLogger1.trace("/index trace"); //code này ko hiển thị vì log level ở file Log4j2.xml
		fileLogger1.debug("/index debug");
		fileLogger1.info("/index info");
		fileLogger1.warn("/index warning");
		fileLogger1.error("/index error");
		fileLogger1.fatal("/index fatal");
		
		//
		fileLogger2.trace("/index trace"); //code này ko hiển thị vì log level ở file Log4j2.xml
		fileLogger2.debug("/index debug");
		fileLogger2.info("/index info");
		fileLogger2.warn("/index warning");
		fileLogger2.error("/index error");
		fileLogger2.fatal("/index fatal");

		return "index";
	}



}