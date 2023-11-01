package core;

import java.time.LocalDate;

public class Mobile  {
   private String name,company;
   private double price;
   private int mobileId;
   private boolean isAvailable;
   private LocalDate modelYear;
   private MobileCategory model;
  // public static int mId;
//   static {
//	   mId=1;
//   }
public Mobile(int mobileId,String name, String company, double price,  LocalDate modelYear,
		MobileCategory model) {
	super();
	this.mobileId=mobileId;
	this.name = name;
	this.company = company;
	this.price = price;
	this.isAvailable = true;
	this.modelYear = modelYear;
	this.model = model;
}

public int getMobileId() {
	return mobileId;
}
public void setMobileId(int mobileId) {
	this.mobileId = mobileId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public boolean isAvailable() {
	return isAvailable;
}
public void setAvailable(boolean isAvailable) {
	this.isAvailable = isAvailable;
}
public LocalDate getModelYear() {
	return modelYear;
}
public void setModelYear(LocalDate modelYear) {
	this.modelYear = modelYear;
}
public MobileCategory getModel() {
	return model;
}
public void setModel(MobileCategory model) {
	this.model = model;
}
@Override
public String toString() {
	return "Mobile [name=" + name + ", company=" + company + ", price=" + price + ", mobileId=" + mobileId
			+ ", isAvailable=" + isAvailable + ", modelYear=" + modelYear + ", model=" + model + "]";
}
@Override
public boolean equals(Object o) {
	if(o instanceof Mobile) {
		Mobile m=(Mobile)o;
		return this.getMobileId()==m.getMobileId();
	}
	return false;
}




   
}
