package com.training.domains;

public class Hospital implements Comparable<Hospital> {
	
	private int id;
	private String hospitalName;
	private String location;
	private long phoneNumber;
	
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospital(int id, String hospitalName, String location, long phoneNumber) {
		super();
		this.id = id;
		this.hospitalName = hospitalName;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", hospitalName=" + hospitalName + ", location=" + location + ", phoneNumber="
				+ phoneNumber + "]";
	}
	

	@Override
	public int compareTo(Hospital otherHospital) {
		
		if(this.id < otherHospital.id) return -1;
		if(this.id> otherHospital.id) return 1;
		return 0;
	}

}