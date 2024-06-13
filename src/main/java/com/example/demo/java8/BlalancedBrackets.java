package com.example.demo.java8;

public class BlalancedBrackets {

	public static boolean areBalancedBrackets(String exp) {

		int i = -1;
		char[] stack = new char[exp.length()];

		for (char ch : exp.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[')
				stack[++i] = ch;
			else {
				if (i >= 0 && ((stack[i] == '(' && ch == ')') || (stack[i] == '{' && ch == '}')
						|| (stack[i] == '[' && ch == ']')))
					i--;
				else
					return false;
			}
		}
		return i == -1;

	}

	public static void main(String[] args) {

		String expression = "([{}])";

		if (areBalancedBrackets(expression)) {
			System.out.println("is Balanced ");
		} else {
			System.out.println("not balalnced");
		}

	}

}
