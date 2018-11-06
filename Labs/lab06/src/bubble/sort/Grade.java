package bubble.sort;

import java.util.Random;

public class Grade implements Comparable {

	private int value;
	private Random random = new Random();

	public Grade() {
		this.value = 1 + random.nextInt(9);
	}
}
