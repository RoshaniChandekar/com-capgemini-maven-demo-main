package com.capgemini.demo.col;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "One");
		hm.put(2, "Two");
		System.out.println(hm);
		
		HashMap<String,String> stateCode = new HashMap<>();
		stateCode.put("MH","MAHARASHTRA");
		stateCode.put("TS","TELANGANA");
		stateCode.put("KA","KARNATAKA");
		
		System.out.println(stateCode);
		System.out.println(stateCode.get("TS"));
		System.out.println(stateCode.keySet());
		System.out.println(stateCode.values());


	}

}
