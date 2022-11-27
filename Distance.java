package com.bridgelabz.day5;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of x: ");
			int x = sc.nextInt();
			System.out.println("Enter value of y: ");
			int y = sc.nextInt();
			calculate(x,y);
			
		}
		
		
		static void calculate(int x , int y)
		{
			
			double distance = Math.pow((x * x + y * y), 0.5);
			System.out.println("Distance :"+distance);
			
	}
	

}
