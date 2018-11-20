package device;

import org.junit.Assert;
import org.junit.Test;

import service.IdGenerator;

public class SmartDeviceTest {

	@Test
	public void testSmartDevices() {
		SmartThermometer smartDevice = new SmartThermometer(0);
		smartDevice.testNameClash();

		Bluetooth lightBulbBluetooth = new SmartThermometer(0);
		lightBulbBluetooth.pair();
		Assert.assertTrue(lightBulbBluetooth instanceof Mountable);

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
