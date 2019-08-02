package $6_RemoveDupsFromAList;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtilsTest {

	@org.junit.Test
	public void emptyList() {
		List<Integer> input = new ArrayList<>();
		List<Integer> output = ListUtils.removeDuplicates(input);
		assertEquals(0, output.size());
	}

	@org.junit.Test
	public void oneDuplicate() {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 4, 5);
		List<Integer> output = ListUtils.removeDuplicates(input);
		assertEquals(input.size(), output.size() + 1);
		assertEquals(5, output.get(4).intValue());
	}
	
	@org.junit.Test
	public void manyDuplicates() {
		List<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5);
		List<Integer> output = ListUtils.removeDuplicates(input);
		assertEquals(input.size(), output.size() + 3);
		assertEquals(5, output.get(4).intValue());
	}


}
