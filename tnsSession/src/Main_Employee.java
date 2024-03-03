package com.mansi.assignment.utiliti;

import com.mansi.assignment.employee.Developer;
import com.mansi.assignment.employee.Employee;
import com.mansi.assignment.employee.Manager;

public class Main_Employee {

	public static void main(String[] args) {
		Developer d = new Developer();
		d.setName("Mansi");
		d.setEmployeeId(18);
		d.setSalary(35000);
		d.setProlang("Java");
		
		Manager m= new Manager();
		m.setDepartment("IT");
		
		System.out.println("Employee name :"+d.getName());
		System.out.println("Employee Id :"+d.getEmployeeId());
		System.out.println("Employee salary :"+d.getSalary());
		System.out.println("Employee department :"+m.getDepartment());
		System.out.println("Employee Programing language :"+d.getProlang());
	}

}
