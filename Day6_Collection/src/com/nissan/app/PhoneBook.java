package com.nissan.app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import com.nissan.model.Record;

public class PhoneBook {
	public static void main(String args[])
	{ 	HashMap<String,String>list=new HashMap<String,String>();
	HashSet<Record> set=new HashSet<Record>();
		
	while(true)
		{System.out.println("Enter Your Choice");
		System.out.println("1:Add Phone Numbers");
		System.out.println("2:Delete Phone Number");
		System.out.println("3:Search Phone Numbers");
		System.out.println("4:Show All Details");
		Scanner scanner=new Scanner(System.in);
	int choice=scanner.nextInt();
		switch(choice)
	{
	case 1:
		
		System.out.println("Enter the phone number");
		String number=scanner.next();
		System.out.println("Enter the name");
		String name=scanner.next();
		//list.remove(name);
	        list.put(number,name);
	        for (HashMap.Entry<String,String> mapElement : list.entrySet()) {
	            String key = mapElement.getKey();
	            String value=mapElement.getValue();
	    		Record record=new Record(mapElement.getKey(),mapElement.getValue());
	            set.add(record);
	 		
		 }
	        //System.out.println(set);
		
		break;
	case 2:
		//Record record=null;
		System.out.println("Enter the number to be deleted");
		String str=scanner.next();
		list.remove(str);
		 for (HashMap.Entry<String,String> mapElement : list.entrySet()) {
			if( mapElement.getValue().equals((str)) )
			{
				list.remove(str);
			}
			}
			 // String key = mapElement.getKey();
	           // String value=mapElement.getValue();
	          //  new Record(mapElement.getKey(),mapElement.getValue());
	         // set.add(record);
	 		
		 //}
		 
		break;
	case 3:
		System.out.println("Enter the number to be display");
		String display=scanner.next();
		 for (HashMap.Entry<String,String> mapElement : list.entrySet()) {
			 if( list.containsKey(display))
			 {
				System.out.println(display + " " + mapElement.getValue() );
				 }
			 }
		
		break;
	case 4:
		System.out.println("Display All Values");
		 //System.out.println(set);
		 System.out.println(list);

		break;
		default:
			break;
	}


		
	}
	}

}
