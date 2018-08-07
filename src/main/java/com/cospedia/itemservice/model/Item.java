package com.cospedia.itemservice.model;

import org.springframework.data.annotation.Id;

public class Item {

	private String id;

	private String name;

	private String category;

	private String brand;

	private String description;

	private Double tag;

	private Double rate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getTag() {
		return tag;
	}

	public void setTag(Double tag) {
		this.tag = tag;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}
}
