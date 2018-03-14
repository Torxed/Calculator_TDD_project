package main;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String expression = sc.nextLine();
		
		//Split the String before and after these characters.
		String regex = "(?=[-+*/%])|(?<=[-+*/%])";
		
		//Put each token into this array.
		String[] expr = expression.split(regex);
		
		//Test
		//Prints each token in the array.
		for (String s : expr) {
			System.out.println(s);
		}
		
		//Test with ex. 44+44
		//This will print the +
		System.out.println(expr[1]);
		

	}
	
}
