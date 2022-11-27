package com.bridgelabz;
import java.util.Scanner;
public class ConsonentVowel {
public static void main(String args[]) {
	 char ch = 'i';
System.out.println("please enter character");
Scanner n = new Scanner(System.in);
    ch=n.next().charAt(0);
     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
    		 ch == 'A' || ch == 'E' || ch =='I' || ch =='o' || ch =='U' )
         System.out.println(ch + " is vowel");
     else
         System.out.println(ch + " is consonant");
	n.close();
   }
}
