package com.bridgelabz;

public class Largestnumber {
public static void main(String args[]) {
	double n1 = 1000.025, n2 = 1000.25, n3 = 1000.225;

    if( n1 >= n2 && n1 >= n3)
        System.out.println(n1 + " is the largest number.");

    else if (n2 >= n1 && n2 >= n3)
        System.out.println(n2 + " is the largest number.");

    else
        System.out.println(n3 + " is the largest number.");
}
}
