package com.cospedia.itemservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "items")
public class ItemController {

	@RequestMapping(value = "/")
	public String findAll() {
		return "{\"message\":\"I am item service\"}";
	}
}
