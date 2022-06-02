package com.capgemini.demo.col;

import java.util.ArrayList;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Delhi");
		
		cities.add(1, "Bangalore");
		cities.set(3, "Chennai");

	}

}
