package com.capgemini.demo.col;

import java.util.ArrayList;
import java.util.Iterator;



public class ItDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("sonu");
		list.add("monu");
		list.add("tonu");
		list.add("ponu");
		list.add("gonu");
		
		System.out.println(list);
		
		
		System.out.println("iterate using for loop:");
		for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));

	}
		
		System.out.println("iterate using for each loop:");
		for(String elem : list) {
		System.out.println(elem);
		}
	
		System.out.println("iterate using iterator");
		
	     Iterator<String> it = list.iterator();
		System.out.println(it);
}
}
