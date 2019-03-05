package com.catherine.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("è")
public class Pet {
	private String petType;
	private String color;
	public String getPetType() {
		return petType;
	}
	@Value(value="�ӷ�è")
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getColor() {
		return color;
	}
	@Value(value="����ɫ")
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Pet [petType=" + petType + ", color=" + color + "]";
	}
	
}
