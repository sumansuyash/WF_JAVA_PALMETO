package com.training.utils;

public class BloodDonar {
	private long mobileNumber;
	private String bloodDonarName;
	private String bloodGroup;
	private String location;
	@Override
	public String toString() {
		return "BloodDonar [mobileNumber=" + mobileNumber + ", bloodDonarName=" + bloodDonarName + ", bloodGroup="
				+ bloodGroup + ", location=" + location + "]";
	}
	public BloodDonar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BloodDonar(long mobileNumber, String bloodDonarName, String bloodGroup, String location) {
		super();
		this.mobileNumber = mobileNumber;
		this.bloodDonarName = bloodDonarName;
		this.bloodGroup = bloodGroup;
		this.location = location;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getBloodDonarName() {
		return bloodDonarName;
	}
	public void setBloodDonarName(String bloodDonarName) {
		this.bloodDonarName = bloodDonarName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
