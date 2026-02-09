package com.deezyWallet.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hey")
public class PingPong {

	@GetMapping("/ping")
	public String balance() {
		return "pong";
	}
}
