package controller;

import device.SmartDevice;
import room.Room;

public class MainController {

	private final int MAX_NUMBER_OF_ROOMS = 10;
	private int roomIndex = 0;
	private Room[] rooms = new Room[MAX_NUMBER_OF_ROOMS];

	public int turnOffAllSmartDevices() {
		int turnedOffDevices = 0;
		SmartDevice[] allSmartDevices = getAllSmartDevices();
		for (int i = 0; i < allSmartDevices.length; i++) {
			SmartDevice currentSmartDevice = allSmartDevices[i];
			if (currentSmartDevice.isTurnedOn()) {
				currentSmartDevice.turnOff();
				turnedOffDevices++;
			}
		}
		return turnedOffDevices;
	}

	public int turnOnAllSmartDevices() {
		int turnedOnDevices = 0;
		SmartDevice[] allSmartDevices = getAllSmartDevices();
		for (int i = 0; i < allSmartDevices.length; i++) {
			SmartDevice currentSmartDevice = allSmartDevices[i];
			if (!currentSmartDevice.isTurnedOn()) {
				currentSmartDevice.turnOn();
				turnedOnDevices++;
			}
		}
		return turnedOnDevices;
	}

	public SmartDevice[] getAllSmartDevices() {
		int allSmartDevicesCount = 0;
		for (int i = 0; i < roomIndex; i++) {
			allSmartDevicesCount += rooms[i].getNumberOfDevices();
		}
		SmartDevice[] allSmartDevices = new SmartDevice[allSmartDevicesCount];
		int allSmartDevicesIndex = 0;
		if (roomIndex != 0) {
			for (int i = 0; i < roomIndex; i++) {
				Room currentRoom = rooms[i];
				SmartDevice[] currentRoomSmartDevices = currentRoom.getSmartDevices();
				int currentRoomNumberOfDevices = currentRoom.getNumberOfDevices();
				for (int j = 0; j < currentRoomNumberOfDevices; j++) {
					allSmartDevices[allSmartDevicesIndex++] = currentRoomSmartDevices[j];
				}
			}
		}
		return allSmartDevices;
	}

	public boolean addRoom(Room room) {
		if (roomIndex >= MAX_NUMBER_OF_ROOMS) {
			return false;
		}
		rooms[roomIndex++] = room;
		return true;
	}

	public String getStatus() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("System specs: \n");

		for (int i = 0; i < roomIndex; i++) {
			stringBuilder.append("\t").append(rooms[i].getStatus()).append("\n");
		}
		return stringBuilder.toString();
	}

	public SmartDevice getSmartDeviceById(int deviceId) {
		for (int i = 0; i < roomIndex; i++) {
			SmartDevice smartDevice = rooms[i].getSmartDeviceById(deviceId);
			if (smartDevice != null) {
				return smartDevice;
			}
		}
		return null;
	}
}
