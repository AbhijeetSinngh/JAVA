package core;

public enum MobileCategory {
       PRO(50000),PROPLUS(80000),PROPLUSMAX(100000),SE(40000);
       public double modelPrice;
      private MobileCategory(double modelPrice) {
    	   this.modelPrice=modelPrice;
       }
	public double getModelPrice() {
		return modelPrice;
	}
	public void setModelPrice(double modelPrice) {
		this.modelPrice = modelPrice;
	}
      
}
