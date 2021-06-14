package CarApp;

import java.util.Scanner;

public class Practice
{

	public static void main(String[] args) {
		String input = "we are growing";
		String op = " ";
		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 0) {
				op += (char) (input.charAt(i) - 32);
			} else
				op += input.charAt(i);

		}
		System.out.println(op);
	}
	}


