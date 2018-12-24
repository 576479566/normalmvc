package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author sunjibo
 * @date 18-12-24
 */
@Controller
public class VueDemoController {

	@GetMapping("/vueDemo")
	public String vueDemo() {
		return "vueDemo.html";
	}
}
