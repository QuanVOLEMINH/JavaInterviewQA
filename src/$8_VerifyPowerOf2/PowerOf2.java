package $8_VerifyPowerOf2;

import java.util.function.Function;

public class PowerOf2 implements Function<Integer, Boolean> {

	@Override
	public Boolean apply(Integer t) {
		if (t == 0 || t == 1)
			return true;
		while (t != 1) {
			if (t % 2 != 0) {
				return false;
			}
			t = t / 2;
		}

		return true;
	}
}
