package device;

public interface Bluetooth extends Mountable {

	public void pair();

	default void test() {

	}

	static void staticTest() {

	}
}
