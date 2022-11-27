package com.bridgelabz;
import java.util.Scanner;

public class Flipcoin {
	public static void main(String args[]) {
		int heads=0;
		int tails=0;
		int count=1;
		double random=0.0;
		
		System.out.println("enter the number");
		Scanner n = new Scanner(System.in);
		int flips =n.nextInt();
		
		for (count=1; count <= flips; count++) {
			random=Math.random();
			System.out.print(count+" "+random);
			if (random<0.5) {
				heads++;
				System.out.println(" Heads ");
			}
			else {
				tails++;
				System.out.println(" Tails ");
			}
			count++;
		}
		n.close();
		System.out.println();
		System.out.println("Number of Heads :" +heads);
		System.out.println("Number of Tails :" +tails);
		
		double headpercent = (double)heads/flips*100;
		double tailspercent = (double)tails/flips*100;
		
		System.out.println("Percentage of Heads :" +headpercent);
		System.out.println("Percentage of Tails :" +tailspercent);
		
	}	
}		
			
			
			
		
		


