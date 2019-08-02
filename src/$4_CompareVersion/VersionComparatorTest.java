package $4_CompareVersion;

import static org.junit.Assert.*;

import java.util.Comparator;

public class VersionComparatorTest {

	private Comparator<String> vcp = new VersionComparator();

	@org.junit.Test
	public void compareVersions() {
		assertEquals(0, vcp.compare("14", "14.0"));
		assertTrue(vcp.compare("15", "14") > 0);
		assertTrue(vcp.compare("15.1", "14.12.13") > 0);
		assertEquals(0, vcp.compare("15.1", "15.1.0"));
		assertTrue(vcp.compare("15.1", "15.1.2") < 0);
		assertTrue(vcp.compare("15.1.1", "14.13.10") > 0);
		assertTrue(vcp.compare("14.13", "14.10.9") > 0);
		assertTrue(vcp.compare("14.13.55", "14.13.9") > 0);
		assertEquals(0, vcp.compare("14.10.20", "14.10.20"));
	}

}
