package $9_VerifyANumberIsAPalindrome;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PalindromeNumberTest {
	private Function<Long, Boolean> underTest = new PalindromeNumber();

	@Parameters(name = "({index}): isNumberPalindrome ({0})= {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { {0L, true }, {1L, true }, {99L, true }, { -121L, true },
				{121L, true }, { -1221L, true }, {1230321L, true }, {970_536_635_079L, true }, });
	}

	@Parameter
	public long input;

	@Parameter(value = 1)
	public boolean expected;

	@org.junit.Test
	public void palindrome() {
		assertEquals(expected, underTest.apply(input));
	}
}
