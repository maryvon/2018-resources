package controller;

import org.junit.Test;

import device.SmartDevice;
import device.SmartLightBulb;
import device.SmartThermometer;
import room.Room;
import service.IdGenerator;

public class MainControllerTest {

	@Test
	public void testDrive() {
		SmartLightBulb smartLightBulb = new SmartLightBulb(IdGenerator.getNextId());
		smartLightBulb.setName("philips-hue");
		smartLightBulb.setColor("red");
		smartLightBulb.setIntensity(50);

		SmartThermometer smartThermometer = new SmartThermometer(IdGenerator.getNextId());
		smartThermometer.setName("nest");
		smartThermometer.setTemperature(24.0);

		Room firstRoom = new Room();
		firstRoom.setName("bedroom");

		firstRoom.addSmartDevice(smartLightBulb);
		firstRoom.addSmartDevice(smartThermometer);

		MainController mainController = new MainController();
		mainController.addRoom(firstRoom);
		System.out.println(mainController.getStatus());

		mainController.turnOnAllSmartDevices();
		//System.out.println(mainController.getStatus());

		mainController.turnOffAllSmartDevices();
		//System.out.println(mainController.getStatus());

		SmartDevice smartDevice = mainController.getSmartDeviceById(0);
		if (smartDevice != null) {
			//System.out.println(smartDevice.getStatus());
		}
	}
}
