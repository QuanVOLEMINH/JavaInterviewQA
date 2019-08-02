package $8_VerifyPowerOf2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PowerOf2Test {
	@Parameters(name = "({index}): isPowerOf2 ({0})= {1}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{0, true},
			{1, true},
			{2, true},
			{4, true},
			{32, true},
			{3, false},
			{5, false}
		});
	}
	
	@Parameter
	public int input;
	
	@Parameter(value=1)
	public boolean expected;
	
	private Function<Integer, Boolean> underTest = new PowerOf2();
	
	@org.junit.Test
	public void powerOf2() {
		assertEquals(expected, underTest.apply(input));
	}
}
