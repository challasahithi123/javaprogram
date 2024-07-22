package com.tnsif.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Testgeneric {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("rohan");
		al.add("guhani");
		al.add("ramya");
		System.out.println("elements"+al);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
