package com.catherine.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("Ã¨")
public class Pet {
	private String petType;
	private String color;
	public String getPetType() {
		return petType;
	}
	@Value(value="¼Ó·ÆÃ¨")
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getColor() {
		return color;
	}
	@Value(value="¿§·ÈÉ«")
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Pet [petType=" + petType + ", color=" + color + "]";
	}
	
}
