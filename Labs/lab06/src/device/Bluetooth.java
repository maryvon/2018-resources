package device;

public interface Bluetooth {

	public final int attribute = 0;
	public static int someOtherAttribute = 10;

	public void pair();

	default void test() {

	}

	static void staticTest() {

	}
}
