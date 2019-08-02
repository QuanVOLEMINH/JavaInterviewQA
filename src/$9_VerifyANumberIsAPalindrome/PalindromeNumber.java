package $9_VerifyANumberIsAPalindrome;

import java.util.function.Function;

public class PalindromeNumber implements Function<Long, Boolean> {

	@Override
	public Boolean apply(Long t) {
		long input = t > 0 ? t : -t;
		char[] charInput = Long.toString(input).toCharArray();

		int bwIndex;
		final int inputLength = charInput.length;

		for (int fwIndex = 0; fwIndex < inputLength / 2; fwIndex++) {
			bwIndex = inputLength - 1 - fwIndex;
			if (charInput[fwIndex] != charInput[bwIndex]) {
				return false;
			}
		}
		return true;
	}
}
