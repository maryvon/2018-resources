package room;

import java.util.Objects;

import device.SmartDevice;
import service.IdGenerator;

public class Room {

	private final int MAX_NUMBER_OF_SMART_DEVICES = 5;
	private String name;
	private int smartDevicesIndex = 0;
	private SmartDevice[] smartDevices = new SmartDevice[MAX_NUMBER_OF_SMART_DEVICES];

	public boolean addSmartDevice(SmartDevice smartDevice) {
		if (smartDevicesIndex >= MAX_NUMBER_OF_SMART_DEVICES) {
			return false;
		}
		smartDevices[smartDevicesIndex++] = smartDevice;
		return true;
	}

	public SmartDevice[] getSmartDevices() {
		return smartDevices;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		IdGenerator.getNextId();
		this.name = name;
	}

	public int getNumberOfDevices() {
		return smartDevicesIndex;
	}

	public String getStatus() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Room specs: name=").append(name).append("\n");

		for (int i = 0; i < smartDevicesIndex; i++) {
			stringBuilder.append("\t\t").append(smartDevices[i].getStatus()).append("\n");
		}
		return stringBuilder.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Room)) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (this.getName().equals(((Room) obj).getName())) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	public SmartDevice getSmartDeviceById(int deviceId) {
		for (int i = 0; i < smartDevicesIndex; i++) {
			SmartDevice currentSmartDevice = smartDevices[i];
			if (currentSmartDevice.getId() == deviceId) {
				return currentSmartDevice;
			}
		}
		return null;
	}
}
