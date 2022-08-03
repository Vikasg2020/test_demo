 
public class Person 
{
	
	String name ;
      
	void getspedingLimit() {
		
	}
	
	public void getDetail() {
		 
	}

}

class MP extends Person
{
	
	protected int spending_limit ;
	protected  long moreSpending;
	protected String role,Constitution,car;
	
	MP(){
		
		this.spending_limit=10000;
		this.role="MP";
		this.moreSpending=100000;
	}
	
     
	
	void setcarMp(String c) {
		 this.car=c;
	}
	String getcarMp() {
		
		return car;
	}
	
     String getRole() {
		
		return role;
	}
	
     int getspending_limit() {
 		
 		return spending_limit;
 	}
     
     long getmoreSpending() {
  		
  		return moreSpending;
  	}
}

 class Ministers extends MP
 {
	
	  Ministers(){
		  this.spending_limit=1000000;
		  this.role="Minister";
		  this.moreSpending=100000000;
	  }
}
 
 class PM extends MP
 {
	 private boolean permission;
	 
	 PM(){
		 
		 this.spending_limit=1000000000;
		  this.role="PM";
		  this.moreSpending=10000000000l;
	 }
	 
	 void setPermission() {
		 
		 this.permission=true;
	 }
	 
	 
     boolean getPermission() {
		 
		return this.permission;
	 }
 }

 
 class Commisioner{
	 
	  
	  public void arrest(MP mp, PM pm) {
		  
		  if(mp.getRole()=="MP"&& mp.getspending_limit()<mp.getmoreSpending() ) {
			  
			  System.out.println("Arrested");
		  }
		  
		  else if(mp.getRole()=="Minister"&& mp.getspending_limit()<mp.getmoreSpending()&& pm.getPermission() ==true) {
			  
			  System.out.println("Arrested");
		  }
		  else {
			  System.out.println("con not Arrested");
		  }
       }
	   
 }
	 
	 
 
 
 class Driver extends Person
 {
	void getDriverDetail() {
		
		name="mahesh";
	}
 
 }
 
 class Vehicle{
	 
	  
	 protected String model,color;
	  
	 
	 public  void setColor(String veColor) {
			 
		 this.color=veColor;
		 }
	 
	 public void setModel(String veModel) {
		 
		 this.model=veModel;
		 
	 }
	 
	 
	 public  String getColor() {
		 
		   return this.color;
		 }
	 
	 public String getModel() {
		 
		return this.model;
		 
	 } 
 }
 
 class Car extends Vehicle
 {
	public void getDetail() {
		System.out.println("This car is of "+getColor() + "Color and was Mode"+getModel());
	}
	 
 }
 
 class Aircraft extends Vehicle{
	 
	 public void getDetail() {
			System.out.println("This car is of "+getColor() + "Color and was Mode"+getModel());
		}
 }