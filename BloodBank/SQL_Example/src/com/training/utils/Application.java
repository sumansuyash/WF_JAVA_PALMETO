package com.training.utils;

import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		BloodDonar donar=new BloodDonar(7777,"wecd","opos","india");
		CrudExample crud=new CrudExample();
		
		int rowAdded=crud.add(donar);
		System.out.println(rowAdded);
		List<BloodDonar> list=crud.findAll();
		for(BloodDonar x:list) {
			System.out.println(x);
		}
		Scanner obj =new Scanner(System.in);
		System.out.print("Enter blood Group to search:");
		String x=obj.next();
		List<BloodDonar> list2=crud.findBloodGroup(x);
		for(BloodDonar y:list2) {
			System.out.println(y);
		}
		obj.close();
	}
}
