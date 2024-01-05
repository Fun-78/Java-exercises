package com.itbulls.lian;

import java.util.Scanner;

public class Student {
	public static void main(String[]args){
        double[] marks = new double[5];
        int i;
        Scanner scan = new Scanner(System.in);

        for( i=0; i<5; i++){
            System.out.print("enter the marks of student" + (i+1) + ":");
            marks[i] = scan.nextInt();
        }
        scan.close();
  System.out.print("The student marks are " + i+1);
    }

}
