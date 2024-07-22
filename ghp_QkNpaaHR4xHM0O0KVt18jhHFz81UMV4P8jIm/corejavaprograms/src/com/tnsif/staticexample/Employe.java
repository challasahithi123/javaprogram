package com.tnsif.staticexample;

public class Employe {
	int eid;
	String name;
	static String company="TNS";
	Employe(int r,String n){
		eid=r;
		name=n;
	}
	void dispaly() {
		System.out.println(eid+" "+name+" "+company);
	}
}
