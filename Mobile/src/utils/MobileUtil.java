package utils;
import static tester.Mobile_tester.mp;

import java.time.LocalDate;

import core.Mobile;
import core.MobileCategory;
public class MobileUtil {
     public static void populateList() {
    	   mp.put(34, new Mobile(34,"Amit", "Google",100000, LocalDate.parse("2001-02-01"),MobileCategory.PROPLUSMAX));
    	   mp.put(35, new Mobile(35,"Abhijeet", "Apple",100000, LocalDate.parse("1996-02-01"),MobileCategory.PROPLUSMAX));
    	   mp.put(36, new Mobile(35,"Ashwini", "Cred",700000, LocalDate.parse("2001-02-01"),MobileCategory.PROPLUS));
    	   mp.put(37, new Mobile(37,"Bhumika", "Microsoft",600000, LocalDate.parse("2001-02-01"),MobileCategory.PROPLUSMAX));
     }
}
