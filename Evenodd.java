package com.bridgelabz;
import java.util.Scanner;
public class Evenodd {
 public static void main(String args[]) {
	 Scanner n = new Scanner(System.in);
	 System.out.print("Please enter a number");
	 int num = n.nextInt();
	 if(num % 2 == 0)
		 System.out.println(num+ " is even ");
	 else
	 { 
		 System.out.println(num+ " is odd ");
	 }		 
		 n.close();
}
}