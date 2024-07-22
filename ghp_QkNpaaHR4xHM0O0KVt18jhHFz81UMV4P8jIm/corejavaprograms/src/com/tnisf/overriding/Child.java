package com.tnisf.overriding;

public class Child extends Father{
int drinking() {
	System.out.println("tea");


	}
public static void main(String[] args) {
	Child c =new Child();
	c.drinking();
	
}

}
