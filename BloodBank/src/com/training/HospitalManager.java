package com.training;

import java.util.*;
import com.training.domains.Hospital;

public class HospitalManager {

	private ArrayList<Hospital> hospitalList;

	public HospitalManager() {
		super();
		this.hospitalList = new ArrayList<>();	
	}
	public boolean addHospital(Hospital hospRef){
		     return this.hospitalList.add(hospRef);	     
	}
	
	public Hospital remove(Hospital hospRef) {
		int idxPos = this.hospitalList.indexOf(hospRef);
		 if(idxPos < 0) {
			 throw new RuntimeException("Element Does not Exist");
			 } else {
		   return this.hospitalList.remove(idxPos);
		 }
	}
	public void printHospitalList() {
		for(Hospital eachHospital : hospitalList) {
			System.out.println(eachHospital);
		}
	}
	public ArrayList<Hospital> getHospitalList() {
		return hospitalList;
	}
}