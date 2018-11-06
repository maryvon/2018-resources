package device;

import org.junit.Test;

import service.IdGenerator;

public class SmartDeviceTest {

	@Test
	public void testSmartDevices() {
		SmartLightBulb lightBulb = new SmartLightBulb(IdGenerator.getNextId());
		lightBulb.helloWorld();

		Bluetooth lightBulbBluetooth = new SmartLightBulb(0);
		lightBulbBluetooth.pair();

		// lightBulb.setName("philips-hue");
		// lightBulb.setColor("red");
		// lightBulb.setIntensity(50);
		// System.out.println(lightBulb.getStatus());
		//
		// SmartThermometer thermometer = new SmartThermometer(IdGenerator.getNextId());
		// thermometer.setName("nest");
		// thermometer.setTemperature(24.0);
		// System.out.println(thermometer.getStatus());
	}
}
