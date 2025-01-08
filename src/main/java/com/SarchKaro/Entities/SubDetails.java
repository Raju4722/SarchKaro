package com.SarchKaro.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
	
@Entity(name="Sub")
public class SubDetails {
@Id
private int size;
private int price;
private int stockleft;
private String location;
@ManyToOne(fetch = FetchType.LAZY)
@JsonIgnore
private MainDetails main;

public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getStockleft() {
	return stockleft;
}
public void setStockleft(int stockleft) {
	this.stockleft = stockleft;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public MainDetails getMain() {
	return main;
}
public void setMain(MainDetails main) {
	this.main = main;
}
}
