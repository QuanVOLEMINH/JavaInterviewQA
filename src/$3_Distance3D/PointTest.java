package $3_Distance3D;

import static org.junit.Assert.*;

public class PointTest {

	@org.junit.Test
	public void distance() {
		Point p1 = new Point(10, 3, 6);
		Point p2 = new Point(7, 3, 2);
		assertEquals(Double.compare(5, p1.distance(p2)), 0);
		assertEquals(Double.compare(5, p2.distance(p1)), 0);
	}

}
