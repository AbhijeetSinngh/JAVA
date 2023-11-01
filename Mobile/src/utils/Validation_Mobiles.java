package utils;

import java.time.LocalDate;

import core.Mobile;
import core.MobileCategory;
import custom_exception.Mobile_Exception;

import static tester.Mobile_tester.mp;


public class Validation_Mobiles {
	
  public static Mobile validateAll(int mobileId,String name, String company, double price, String modelYear,
			String model) throws Mobile_Exception,IllegalArgumentException {
	  LocalDate mYear=LocalDate.parse(modelYear);
	  MobileCategory mCatg=MobileCategory.valueOf(model);
	  validateKey(mobileId);
	  return new Mobile(mobileId,name,company,price,mYear,mCatg);
  }

private static void validateKey(int mobileId) throws Mobile_Exception {
	  if(mp.containsKey(mobileId)) {
		  throw new Mobile_Exception("Duplicate Mobile Id");
	  }
	
}
}
