package com.tnsif.arraylistdemo;

import java.util.LinkedList;

public class Limkedlistdemo {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("ra");
	l.add(2);
	l.add("sahithi");
	l.add(8.9);
	System.out.println("after inoviking add()"+l);
	l.add(1,"apple");
	l.addFirst("d");
	l.addLast("rashmi");
	System.out.println(l);
	
}
}
