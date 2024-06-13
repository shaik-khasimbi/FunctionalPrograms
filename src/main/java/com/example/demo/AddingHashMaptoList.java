package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddingHashMaptoList {
	static List<UserInformation> list = new ArrayList<>();
	 static {
		 list.add(new UserInformation(1,"Ayan","abc@gamil.com"));
		 list.add(new UserInformation(2, "Abhi", "abhi@gmail.com"));
		list.add( new UserInformation(3, "praveen", "praveen@gmail.com"));
	}
	 
	private static Map<String, List<UserInformation>> staticHashMap = new HashMap<>();
	 static {
		// staticHashMap.put("1", new UserInformation(1,"Ayan","abc@gamil.com"));
	 }
	
	

	public static void main(String[] args) {
	//	List<UserInformation> list = new ArrayList<>();
	
		System.out.println(list);
		
		Map<String, List<UserInformation>> hashMap = new HashMap<>();
		System.out.println(hashMap);
		
		  for(UserInformation user : list) {
			  if(hashMap.containsKey(user.getId())) {
				  hashMap.get(user.getId()).add(user);
				  System.out.println(user);
			  } else {
					List<UserInformation> listofValues = new ArrayList<>();
					listofValues.add(user);
					System.out.println(listofValues);
			  }
		  
		  }
		 
	}

}
