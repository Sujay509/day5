package com.bridgelabz;

public class Swapnumbers {
public static void main(String args[]) {
	float first = 10, second = 20;

    System.out.println("--Before swap--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);
      float temporary = first;
    first = second;
    second = temporary;

    System.out.println("--After swap--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);
}
}
