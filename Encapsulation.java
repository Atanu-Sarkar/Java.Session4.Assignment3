package com.acadgild.session.four;

public class Encapsulation {
	
	    private int eid;
	    private String empName;
	    private int empAge;

	    //Getter and Setter methods
	    public int getEmpID(){
	        return eid;
	    }

	    public String getEmpName(){
	        return empName;
	    }

	    public int getEmpAge(){
	        return empAge;
	    }

	    public void setEmpAge(int newValue){
	        empAge = newValue;
	    }

	    public void setEmpName(String newValue){
	        empName = newValue;
	    }

	    public void setEmpID(int newValue){
	        eid = newValue;
	    }

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
        
        obj.setEmpAge(35);
        obj.setEmpName("Atanu");
        obj.setEmpID(300474);
        
        System.out.println("Employee ID: " + obj.getEmpID());
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee Age: " + obj.getEmpAge());

	}

}
