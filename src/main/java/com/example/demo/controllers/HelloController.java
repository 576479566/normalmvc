package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 和webflux进行对比的类
 * @author sunjibo
 * @date 18-4-13
 */
@RestController
public class HelloController {

	@GetMapping("/hello/{latency}")
	public String hello(@PathVariable long latency){
		try {
			TimeUnit.MILLISECONDS.sleep(latency);
		}catch (InterruptedException e){
			return "Error during thread sleep";
		}
		return "Welcome to reactive world ~";
	}
}
