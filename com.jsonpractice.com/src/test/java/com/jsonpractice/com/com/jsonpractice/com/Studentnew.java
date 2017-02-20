package com.jsonpractice.com.com.jsonpractice.com;

public class Studentnew {
	 private String name;
	     private String maths;
	     private String science;
	     private String english;

	  
	     public Studentnew(){}

	     public Studentnew(String name, String maths, String science, String english) {

	         this.name = name;

	         this.maths = maths;

	         this.science = science;

	         this.english = english;
	
	    //getters and setter..
	     }
	     @Override
	    public String toString() {
	         return this.name+ ": Maths "+ this.maths+ " Science "+this.science+" English "+this.english;
	 	  }
	   //  public String toString() { 
	    //	    return "Name: '" + this.name + "', Height: '" + this.height + "', Birthday: '" + this.bDay + "'";
	    //	} 
	     
	 

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMaths() {
			return maths;
		}

		public void setMaths(String maths) {
			this.maths = maths;
		}

		public String getScience() {
			return science;
		}

		public void setScience(String science) {
			this.science = science;
		}

		public String getEnglish() {
			return english;
		}

		public void setEnglish(String english) {
			this.english = english;
		}

}
