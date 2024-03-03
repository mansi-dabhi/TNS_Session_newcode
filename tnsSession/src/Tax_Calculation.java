package com.tnssessionweek2.person;



public class Tax_Calculation {
public void tac_calculation(Person p) {
		
		
			double tax;
			
			if(p.getAge() >18 && p.getIncome()>=50000 && p.getIncome()<80000) {
				tax=p.getIncome()*0.1;
			}
			else if(p.getAge() >18 && p.getIncome()>=80000 && p.getIncome()<=100000) {
				tax=p.getIncome()*0.2;
			}
			else {
				tax=0;
			}
			System.out.println("tax : "+tax);
		}

}
