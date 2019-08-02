package $10_ArmstrongNumber;

import java.util.function.Function;

public class ArmstrongNumber implements Function<Integer, Boolean> {

	@Override
	public Boolean apply(Integer t) {
		if (t < 0)
			return false;
		
		return sumArmstrongDigits(t) == t;
	}

	private static int numberOfDigits(int n) {
		return String.valueOf(n).length();
	}

	private static int sumArmstrongDigits(int n) {
		int sum = 0;
		int nb = numberOfDigits(n);
		while (n > 0) {
			sum = (int) (sum + Math.pow(n % 10, nb));
			n = n / 10;
		}

		return sum;
	}
}
