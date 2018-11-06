package bubble.sort;

import java.util.Random;

public class Grade implements Comparable {

	private int value;
	private Random random = new Random();

	public Grade() {
		this.value = 1 + random.nextInt(9);
	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public int compareTo(Comparable object) {
		if (this.getValue() == object.getValue()) {
			return 0;
		} else if (this.getValue() < object.getValue()) {
			return 1;
		}
		return -1;
	}
}
