package device;

public interface Bluetooth {

	public final int CONSTANT = 0;

	public void pair();

	default void test() {
		System.out.println("Bluetooth");
	}

	public static void staticTest() {

	}
}
