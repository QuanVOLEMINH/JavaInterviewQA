package $12_HappyNumber;

import java.util.HashSet;
import java.util.Set;

class HappyNumber {

	static boolean isHappyNumber(int n) {
		if (n < 0)
			return false;
		Set<Integer> memory = new HashSet<>();
		int temp = n;

		while (!memory.contains(temp)) {
			memory.add(temp);
			temp = sumSquaredDigits(temp);
			if (temp == 1) {
				return true;
			}
		}
		return false;

	}

	private static int sumSquaredDigits(int n) {
		char[] charInput = String.valueOf(n).toCharArray();
		int sum = 0;
		for (char c : charInput) {
			int d = Character.getNumericValue(c);
			sum += d * d;
		}
		return sum;
	}
}
