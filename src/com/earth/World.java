package com.earth;

public class World {
	private String earth;
	private String contient;
	private String countries;
	private String states;
	private String cities;
	private String location;
	private String areas;
	public String getEarth() {
		return earth;
	}
	public void setEarth(String earth) {
		this.earth = earth;
	}
	public String getContient() {
		return contient;
	}
	public void setContient(String contient) {
		this.contient = contient;
	}
	public String getCountries() {
		return countries;
	}
	public void setCountries(String countries) {
		this.countries = countries;
	}
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	public String getCities() {
		return cities;
	}
	public void setCities(String cities) {
		this.cities = cities;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAreas() {
		return areas;
	}
	public void setAreas(String areas) {
		this.areas = areas;
	}
	public World(String earth, String contient, String countries, String states, String cities, String location,
			String areas) {
	
		this.earth = earth;
		this.contient = contient;
		this.countries = countries;
		this.states = states;
		this.cities = cities;
		this.location = location;
		this.areas = areas;
	}
	@Override
	public String toString() {
		return "World [earth=" + earth + ", contient=" + contient + ", countries=" + countries + ", states=" + states
				+ ", cities=" + cities + ", location=" + location + ", areas=" + areas + "]";
	}
	

}
 
