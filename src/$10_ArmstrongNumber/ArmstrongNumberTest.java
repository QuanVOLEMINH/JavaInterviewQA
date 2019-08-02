package $10_ArmstrongNumber;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArmstrongNumberTest {

	private Function<Integer, Boolean> isArmstrong = new ArmstrongNumber();

	@Parameters(name = "({index}): isArmstrong ({0})= {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { -1, false }, { 0, true }, { 1, true }, { 2, true }, { 9, true },
				{ 123, false }, { 153, true }, { 371, true }, { 372, false }, { 9474, true } });
	}

	@Parameter
	public int input;

	@Parameter(value = 1)
	public boolean expected;

	@org.junit.Test
	public void palindrome() {
		assertEquals(expected, isArmstrong.apply(input));
	}
}
