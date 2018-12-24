package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author sunjibo
 * @date 18-8-29
 */
@Controller
public class GaoDeController {

	@GetMapping("/gaode")
	public String gaode() throws MalformedURLException {
		URL url= new URL("http://api.kuaidi100.com/" +
				"api?id=密钥XXXX&com=”+com公司名称+”tiantian&nu=”+nu快递编号+”11111&show=2&muti=1&order=desc");

		return "index.html";
	}
}
