package tnsSessionweek2;

import java.util.Scanner;

public class Person {
	public String name;
	public int age;
	public double  income;

	
	
	public void vote()
	{
		if(age>=18)
		{
			System.out.println("you are eligible..");
		}
		else
		{
			System.out.println("sorry....");
		}
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getIncome() {
		return income;
	}


	public void setIncome(int income) {
		this.income = income;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", income=" + income + "]";
	}
	
	

}
