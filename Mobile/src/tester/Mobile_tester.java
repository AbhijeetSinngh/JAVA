package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import core.Mobile;
import core.MobileCategory;
import static utils.Validation_Mobiles.validateAll;
import static utils.MobileUtil.populateList;
public class Mobile_tester {
	public static HashMap<Integer,Mobile> mp=new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try(Scanner sc=new Scanner(System.in)){
        	 populateList();
             boolean exit=false;
           
             while(!exit) {
            	  System.out.println("1.Add Mobile 2.Display Mobile "
                   		+ "3.Sort Mobile on the basis of Mobile Id "
                   		+ "4.Sort on ModelPrice and ModelYear 0.Exit");
            	try { switch(sc.nextInt()) {
            	 case 1:System.out.println("1.Add Mobile");
//            	 String name, String company, double price LocalDate modelYear,
//         		MobileCategory model
            	       System.out.println("Enter mobile id mobile name,company,price,modelYear");
            	       Mobile m=validateAll(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
            	       mp.put(m.getMobileId(), m);
            	       break;
            	 case 2:System.out.println("Displaying Details");
            	       for(Mobile m1:mp.values()) {
            	    	   System.out.println(m1);
            	       }
            	       break;
            	 case 3: System.out.println("Sort Mobile on the basis of mobile Id");
            	         TreeMap<Integer,Mobile> tremap=new TreeMap<>(mp);
            	         for(Mobile m2:tremap.values()) {
            	        	 System.out.println(m2);
            	         }
            	         break;
            	 case 4: System.out.println("Sort MobilePrice and Modelyear ");
            	         ArrayList<Mobile> list=new ArrayList<>(mp.values());
            	         Collections.sort(list,new Comparator<Mobile>() {

							@Override
							public int compare(Mobile o1, Mobile o2) {
								int ret=((Double)(o1.getPrice())).compareTo(o2.getPrice());
								if(ret==0) {
									return o1.getModelYear().compareTo(o2.getModelYear());
								}
								return ret;
							}
            	        	 
            	         });
            	         break;
            	 case 0:exit=true;break;
            	 default :System.out.println("Invalid");break;
            	 }
             }catch(Exception e) {
            	 System.out.println(e);}
             }
         }
	}

}
