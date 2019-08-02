package $6_RemoveDupsFromAList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class ListUtils {
	static <E> List<E> removeDuplicates(List<E> list){
		Set<E> result = new LinkedHashSet<>(list);
		return new ArrayList<>(result);
	}
}
