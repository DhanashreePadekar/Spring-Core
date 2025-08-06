package com.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private Integer id;
	private String name;
	private List<String> cources;
	private Set<String> hobbies;
	private Map<String,String> mobaile;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCources() {
		return cources;
	}
	public void setCources(List<String> cources) {
		this.cources = cources;
	}
	public Set<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Map<String, String> getMobaile() {
		return mobaile;
	}
	public void setMobaile(Map<String, String> mobaile) {
		this.mobaile = mobaile;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cources=" + cources + ", hobbies=" + hobbies + ", mobaile="
				+ mobaile + "]";
	}
	
	
	
}
