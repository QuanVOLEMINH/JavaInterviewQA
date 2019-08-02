package $7_DeleteANodeInLinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class LLTest {
	private LinkedList<String> list;
	
	@Before
	public void beforeEachTest() {
		list = new LinkedList<>();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
	}
	
	@org.junit.Test
	public void removeNonExistent() {
		assertFalse(list.remove("abc"));
		assertEquals("[a1 -> a2 -> a3 -> a4 -> a5]", list.toString());
	}
	
	@org.junit.Test
	public void removeFirst() {
		assertTrue(list.remove("a1"));
		assertEquals("[a2 -> a3 -> a4 -> a5]", list.toString());
	}
	
	@org.junit.Test
	public void removeLast() {
		assertTrue(list.remove("a5"));
		assertEquals("[a1 -> a2 -> a3 -> a4]", list.toString());
	}
	
	@org.junit.Test
	public void removeInTheMiddle() {
		assertTrue(list.remove("a3"));
		assertEquals("[a1 -> a2 -> a4 -> a5]", list.toString());
	}
	
	@org.junit.Test
	public void removeAll() {
		assertTrue(list.remove("a1"));
		assertTrue(list.remove("a2"));
		assertTrue(list.remove("a3"));
		assertTrue(list.remove("a4"));
		assertTrue(list.remove("a5"));
		assertEquals("[]", list.toString());
	}
}
