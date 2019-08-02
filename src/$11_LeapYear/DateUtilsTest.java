package $11_LeapYear;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateUtilsTest {

	@Parameters(name = "({index}): isLeapYear ({0})= {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1200, true }, { 1600, true }, { 2000, true }, { 2004, true },
				{ 2016, true }, { 2020, true }, { 1700, false }, { 2013, false }, { 2014, false }, { 2009, false } });
	}

	@Parameter
	public int year;

	@Parameter(value = 1)
	public boolean expected;

	@org.junit.Test
	public void isLeapYear() {
		assertEquals(expected, DateUtils.isLeapYear(year));
	}
}
