package bubble.sort;

public class Sort {

	public static Comparable[] bubbleSortAscending(Comparable[] array, int length) {

		boolean sorted = false;

		while(!sorted) {
			sorted = true;
			for (int i = 0; i < length - 1; i++) {
				Comparable left = array[i];
				Comparable right = array[i + 1];

				if (left.compareTo(right) < 0) {
					sorted = false;
					array[i] = right;
					array[i + 1] = left;
				}
			}
		}

		return array;
	}
}
