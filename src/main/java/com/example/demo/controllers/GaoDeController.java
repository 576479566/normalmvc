package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author sunjibo
 * @date 18-8-29
 */
@Controller
public class GaoDeController {

	@GetMapping("/gaode")
	public String gaode(){
		return "index.html";
	}
}
