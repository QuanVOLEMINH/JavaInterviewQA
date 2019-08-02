package $12_HappyNumber;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class HappyNumberTest {

	@Parameters(name = "({index}): isHappyNumber ({0})= {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 23, true }, { 4, false } });
	}

	@Parameter
	public int input;

	@Parameter(value = 1)
	public boolean expected;

	@org.junit.Test
	public void happyNumber() {
		assertEquals(expected, HappyNumber.isHappyNumber(input));
	}
}
