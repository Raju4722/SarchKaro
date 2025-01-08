package com.SarchKaro.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "Main")
public class MainDetails {
	
	@Id
	private String ProdName;
	private String Gender;
	private int Availability;
	@OneToMany(mappedBy = "main")
	@JsonIgnore
	private List<SubDetails> Extrainfo;
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAvailability() {
		return Availability;
	}
	public void setAvailability(int availability) {
		Availability = availability;
	}
	public List<SubDetails> getExtrainfo() {
		return Extrainfo;
	}
	public void setExtrainfo(List<SubDetails> extrainfo) {
		Extrainfo = extrainfo;
	}
	

}
