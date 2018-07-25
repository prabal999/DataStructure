/**
 * 
 */
package com.ps.ds.stack.impl.problem;

import com.ps.ds.stack.Stack;
import com.ps.ds.stack.impl.LinkedListStack;

/**
 * 
 * @author Prabal Srivastava
 *
 */
public class BalancedParentheses {

	public static void main(String[] args) {
		String testGood = "()(){}{}{()}";
		String testBad = "((({}{}))()";
		
		String testGoodExpression = "(A+B)(AB){A^2}{B^2}{()}";
		String testBadExpression = "(A+B)(AB){A^2}B^2}";

		BalancedParentheses balancedParentheses = new BalancedParentheses();
		System.out.println(balancedParentheses.checkBracket(testGood));
		System.out.println(balancedParentheses.checkBracket(testBad));
		
		System.out.println(balancedParentheses.checkBracketWihtExpression(testGoodExpression));
		System.out.println(balancedParentheses.checkBracketWihtExpression(testBadExpression));
	}

	public boolean checkBracket(final String expression) {
		if (null == expression || expression.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new LinkedListStack<Character>();
		for (char bracket : expression.toCharArray()) {
			switch (bracket) {
			case '(':
				stack.push(')');
				break;
			case '{':
				stack.push('}');
				break;
			case '[':
				stack.push(']');
				break;
			default:
				if (stack.isEmpty() || stack.peek() != bracket) {
					return false;
				}
				stack.pop();
				break;
			}
		}
		return stack.isEmpty();
	}

	public boolean checkBracketWihtExpression(final String expression) {
		if (null == expression) {
			return false;
		}
		Stack<Character> stack = new LinkedListStack<Character>();
		for (char bracket : expression.toCharArray()) {
			switch (bracket) {
			case '(':
				stack.push(')');
				break;
			case '{':
				stack.push('}');
				break;
			case '[':
				stack.push(']');
				break;
			default:
				if (bracket == '(' || bracket == '{' || bracket == '[' || bracket == ')' || bracket == '}'
						|| bracket == ']') {
					if (stack.isEmpty() || stack.peek() != bracket) {
						return false;
					}
					stack.pop();
				}
				break;
			}
		}
		return stack.isEmpty();
	}

}
