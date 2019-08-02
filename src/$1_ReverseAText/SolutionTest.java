package $1_ReverseAText;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SolutionTest {

    @Parameterized.Parameters(name = "(Testcase {index}): reverse({1})= {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {{ "", "" }, { "a", "a" }, { "1234567890", "0987654321" },
                { "aBbA", "AbBa" } });
    }

    @Parameterized.Parameter()
    public String expected;

    @Parameterized.Parameter(value = 1)
    public String input;

    @org.junit.Test
    public void reverse() {
        assertEquals(this.expected, Solution.reverse(this.input));
    }
}