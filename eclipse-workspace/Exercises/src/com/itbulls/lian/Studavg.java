package com.itbulls.lian;

import java.util.Scanner;

public class Studavg {
	public static void main(String[]args) {
		String name;
	    String matricule;
		int[] note = new int[3];
		int i;
		double total = 0, avg;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter student name1: ");
		name = s.nextLine();
		System.out.print("Enter student matricule: ");
        matricule = s.nextLine();
        for(i=0; i<3;i++) {
    		System.out.print("Enter student mark" +(i+1) +": ");
            note[i] = s.nextInt();
        total = total + note[i]; 
        }
        avg = total/3;
       
        s.nextLine();
		System.out.print("Enter student name2: ");
		name = s.nextLine();
		System.out.print("Enter student matricule: ");
        matricule = s.nextLine();
        for(i=0; i<3;i++) {
    		System.out.print("Enter student mark" +(i+1) +": ");
            note[i] = s.nextInt();
        
        total = total + note[i];
        }
        avg = total/3;
        
        //System.out.print("Student" +name + matricule + avg);
	}
	
	

	//public void student() {
		
	

}
