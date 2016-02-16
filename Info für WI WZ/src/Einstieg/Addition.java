package Einstieg;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner eingabe = new Scanner(System.in);
		System.out.print(" 1. Summand: ");
		a=eingabe.nextInt();
		System.out.print(" 2. Summand: ");
		b=eingabe.nextInt();
		c=a+b;
		System.out.print("Summe: " + c);
		eingabe.close();
	}

}
