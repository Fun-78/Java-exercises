package com.itbulls.lian;

import java.util.Scanner;

public class Sphere {
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in); 
		System.out.print("enter the radius: ");
		double r = s.nextDouble();
		double volume = Volume(r);
		  System.out.print("The volume os sphere is:" +volume);

	}
	
  static double Volume(double r) {
		double volume =  (4*22*r*r*r)/(3*7);
		return volume;
	}
  
}
