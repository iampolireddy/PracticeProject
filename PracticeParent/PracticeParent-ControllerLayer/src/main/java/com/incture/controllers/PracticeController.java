/**
 * Shruti.Bodhe
 * 2019-11-29
 */
package com.incture.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/practice", produces = "application/json")
public class PracticeController {

	private final Logger MYLOGGER = LoggerFactory.getLogger(this.getClass());

	public PracticeController() {		
		System.err.println("=================conflict===============");	
		System.err.println("=================conflict2===============");	
		MYLOGGER.info("C6");
		System.err.println("================================");
		System.err.println("=================e1===============");

		System.err.println("In Practice Controllers....");
		System.err.println("Git Chnges testing");
		System.err.println("c2");
		System.err.println("c3");
		System.err.println("c4");	

	}
}
