package tnsSessionweek2;

import java.util.Scanner;

public class Person_Main {
	public static void main(String [] args)
	{
	
	
	    Person p= new Person();
	    p.setAge(15);
	    p.setName("mansi");
	    p.setIncome(2000);
	    p.getName();
	    p.getAge();
	    p.getName();
	    
	    System.out.println(p.toString());
	    p.vote();
	}

}
