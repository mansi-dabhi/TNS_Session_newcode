package com.tnssessionweek2.person;


public class Person_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person p= new Person();
		    p.setAge(19);
		    p.setName("mansi");
		    p.setIncome(50000);
		    p.getName();
		    p.getAge();
		    p.getName();
		    
		    System.out.println(p.toString());
		    p.vote();
		    
		    Tax_Calculation tax = new Tax_Calculation();
		    tax.tac_calculation(p);

	}

}
