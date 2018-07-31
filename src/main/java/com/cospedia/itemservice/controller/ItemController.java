package com.cospedia.itemservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "items")
public class ItemController {

	@GetMapping(value = "/")
	public String findAll(@PathVariable String id) {
		return "{\"message\":\"I am item service\"}";
	}
}
