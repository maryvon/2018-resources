package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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
		smartLightBulb.helloWorld();
//		smartLightBulb.setColor("red");
//		smartLightBulb.setIntensity(50);

		Random random = new Random();
		List<SmartLightBulb> smartLightBulbs = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			smartLightBulb = new SmartLightBulb(IdGenerator.getNextId());
			smartLightBulb.setIntensity(random.nextInt(100));
			smartLightBulbs.add(smartLightBulb);
		}

		smartLightBulbs.stream().map(SmartLightBulb::getIntensity).forEach(System.out::println);

		Collections.sort(smartLightBulbs);

		smartLightBulbs.stream().map(SmartLightBulb::getIntensity).forEach(System.out::println);


//		SmartThermometer smartThermometer = new SmartThermometer(IdGenerator.getNextId());
//		smartThermometer.setName("nest");
//		smartThermometer.setTemperature(24.0);
//
//		Room firstRoom = new Room();
//		firstRoom.setName("bedroom");
//
//		firstRoom.addSmartDevice(smartLightBulb);
//		firstRoom.addSmartDevice(smartThermometer);
//
//		MainController mainController = new MainController();
//		mainController.addRoom(firstRoom);
//		System.out.println(mainController.getStatus());
//
//		mainController.turnOnAllSmartDevices();
//		//System.out.println(mainController.getStatus());
//
//		mainController.turnOffAllSmartDevices();
//		//System.out.println(mainController.getStatus());
//
//		SmartDevice smartDevice = mainController.getSmartDeviceById(0);
//		if (smartDevice != null) {
//			//System.out.println(smartDevice.getStatus());
//		}
	}
}
