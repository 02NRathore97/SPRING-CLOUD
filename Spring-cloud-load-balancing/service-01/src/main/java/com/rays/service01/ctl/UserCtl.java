package com.rays.service01.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "User")
public class UserCtl {

	@GetMapping("display")
	public String display() {
		return "Service01 display method..!!";
	}

	@PostMapping("submit")
	public String submit() {
		return "Service01 submit method..!!";
	}

}
