package com.yuvraj;

class Employee_ {
    private String name;
    private int salary;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int s) {
        salary = s;
    }

    public int getSalary() {
        return salary;
    }
    
public class Task26 {
	
	 public static void main(String[] args) {
	        Employee_ emp = new Employee_();
	        emp.setName("Sneha");
	        emp.setSalary(50000);
	        System.out.println("Name: " + emp.getName());
	        System.out.println("Salary: " + emp.getSalary());
	    }
	}
}


	   