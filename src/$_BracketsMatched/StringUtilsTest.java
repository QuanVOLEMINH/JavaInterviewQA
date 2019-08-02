package $_BracketsMatched;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringUtilsTest {
	@Parameters(name = "({index}): isStringBalanced ({0})= {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { "[(])", false }, { "[(]", false }, { "", true }, { "[()]", true }, });
	}

	@Parameter
	public String input;

	@Parameter(value = 1)
	public boolean expected;

	@org.junit.Test
	public void isBalanced() {
		assertEquals(expected, StringUtils.isBalanced(input));
	}
}
