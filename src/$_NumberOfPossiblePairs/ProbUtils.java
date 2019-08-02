package $_NumberOfPossiblePairs;

public class ProbUtils {

	public static int possiblePairsWithoutOrders(int n) {
		return n * (n - 1) / 2;
	}
}
