package com.bridgelabz;
import java.util.Scanner;
public class Primefactors {
public static void main(String[] args) {
	int N;
	Scanner s = new Scanner(System.in);
	System.out.print("Please enter the number : ");
	N = s.nextInt();
	System.out.println("The prime factors for the "+N+" are : ");
	for(int i = 2; i*i <= N; i++) {
        while(N%i == 0) {
           System.out.println(i+" ");
           N = N/i;
        }
     }
     if(N >2) {
        System.out.println(N);
     }
}
}
