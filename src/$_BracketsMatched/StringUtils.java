package $_BracketsMatched;

import java.util.Stack;

class StringUtils {

	static boolean isBalanced(String s) {
		char[] charInput = s.toCharArray();
		Stack<Character> charStack = new Stack<>();

		for (char temp : charInput) {
			if (isOpeningChar(temp)) {
				System.out.println("opening");
				charStack.push(temp);
			} else {
				System.out.println("closing");
				if (charStack.empty() || !isCharsMatched(charStack.pop(), temp)) {
					return false;
				}
			}
		}

		System.out.println("---");
		return charStack.empty();
	}

	private static boolean isOpeningChar(char c) {
		return (c == '[') || (c == '{') || (c == '(');
	}

	private static boolean isCharsMatched(char openingChar, char closingChar) {
		return (openingChar == '[' && closingChar == ']') || (openingChar == '{' && closingChar == '}')
				|| (openingChar == '(' && closingChar == ')');
	}

}
