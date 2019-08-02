package $1_ReverseAText;

class Solution {
	static String reverse(String input) {
		if (input == null || input.equals("")) {
			return "";
		}
		char[] inputArr = input.toCharArray();
		final int l = inputArr.length;
		int bIndex;
		for (int fIndex = 0; fIndex < l / 2; fIndex++) {
			bIndex = (l - 1) - fIndex;
			// swap f and b
			char temp  = inputArr[fIndex];
			inputArr[fIndex] = inputArr[bIndex];
			inputArr[bIndex] = temp;
		}

		return String.valueOf(inputArr);
	}

}
