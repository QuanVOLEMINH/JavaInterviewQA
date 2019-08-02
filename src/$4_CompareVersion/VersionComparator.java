package $4_CompareVersion;

import java.util.Arrays;
import java.util.Comparator;

public class VersionComparator implements Comparator<String> {

	@Override
	public int compare(String version1, String version2) {
		int[] v1 = Arrays.stream(version1.split("\\.")).mapToInt(Integer::parseInt).toArray();
		int[] v2 = Arrays.stream(version2.split("\\.")).mapToInt(Integer::parseInt).toArray();
		int l1 = v1.length;
		int l2 = v2.length;
		int i = 0;

		while ((i < l1) || (i < l2)) { // run until end
			if ((i < l1) && (i < l2)) {
				if (v1[i] > v2[i])
					return 1;
				if (v1[i] < v2[i])
					return -1;
			} else if (i < l1) {
				if (v1[i] != 0)
					return 1;
			} else {
				if (v2[i] != 0)
					return -1;
			}

			i++;
		}

		return 0;
	}

}
