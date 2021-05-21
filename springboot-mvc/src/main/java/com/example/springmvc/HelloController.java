package com.example.springmvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanjizne
 *
 * 2021年4月7日
 */
@RestController
public class HelloController {

	
	@GetMapping(value = "/hello")
	public String hello() {
		return "hello world:"+System.currentTimeMillis();
	}
	
	
}
