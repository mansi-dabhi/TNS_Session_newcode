package tnssession;

import java.util.Scanner;

public class Area_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length in cm:");
		int l = sc.nextInt();
		System.out.println("Enter Breadth in cm : ");
		int b=sc.nextInt();
		Area ar = new Area();
		ar.setDim(l, b);
		System.out.println("Area of rectangle is cm^2 : "+ar.getArea());

	}


}
