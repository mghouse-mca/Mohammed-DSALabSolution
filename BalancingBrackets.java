package com.greatlearning.main;

import java.util.Stack;

public class BalancingBrackets {

	public static void main(String[] args) {

		String exp = "([[{}]])";
		// String exp = "([[{}]])))";

		// String exp = "{[()()]()}";
		// String exp = "{[()()]()}}";

		if (isBalanced(exp)) {
			System.out.println("The entered String has BALANCED Brackets");
		} else {
			System.out.println("The entered Strings do not contain BALANCED Brackets");
		}

	}

	public static boolean isBalanced(String exp) {
		
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < exp.length(); i++) {
			char a = exp.charAt(i);
			char b = ' ';
			if (!stack.isEmpty()) {
				b = stack.peek();
			}
			if (a == '(' || a == '[' || a == '{') {
				stack.push(a);
				continue;
			} else if ((b == '(' && a == ')') || (b == '[' && a == ']') || (b == '{' && a == '}')) {
				stack.pop();
				continue;
			} else {
				return false;
			}
		}
		return stack.isEmpty();
	}
}
