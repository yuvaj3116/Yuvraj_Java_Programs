package com.yuvraj;

class Employee {
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}
	private long ID;
	private long Salary;
}
	
public class Task9 {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setName("Yuvraj");
		obj.setID(126410);
		obj.setSalary(4000000);
		
		System.out.println("Employee Name :" + obj.getName() + " " + "Employee Id :" + obj.getID() + " " + "Salary :" + obj.getSalary());

	}

}