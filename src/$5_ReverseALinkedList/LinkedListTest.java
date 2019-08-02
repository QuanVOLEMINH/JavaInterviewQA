package $5_ReverseALinkedList;

import static org.junit.Assert.*;

public class LinkedListTest {

	@org.junit.Test
	public void reverseEmptyList() {
		LinkedList<String> list = new LinkedList<>();
		list.reverse();
		assertEquals("[]", list.toString());
	}
	
	@org.junit.Test
	public void reverseOneElementList() {
		LinkedList<String> list = new LinkedList<>();
		list.add("a1");
		list.reverse();
		assertEquals("[a1]", list.toString());
	}
	
	@org.junit.Test
	public void reverseManyElementsList() {
		LinkedList<String> list = new LinkedList<>();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
		System.out.println(list.toString());
		assertEquals("[a1 -> a2 -> a3 -> a4 -> a5]", list.toString());
		list.reverse();
		assertEquals("[a5 -> a4 -> a3 -> a2 -> a1]", list.toString());
		System.out.println(list.toString());
	}

}
