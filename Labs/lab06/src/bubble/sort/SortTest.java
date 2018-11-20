package bubble.sort;

import java.util.Arrays;

import org.junit.Test;

public class SortTest {

	@Test
	public void testBubbleSortAscending() {

		Grade[] grades = new Grade[100];

		for (int i = 0; i < 100; i++) {
			grades[i] = new Grade();
		}

		Arrays.stream(grades).map(Grade::getValue).forEach(System.out::println);

		Sort.bubbleSortAscending(grades, 100);

		Arrays.stream(grades).map(Grade::getValue).forEach(System.out::println);
	}
}
