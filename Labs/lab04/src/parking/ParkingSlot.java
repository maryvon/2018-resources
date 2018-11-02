package parking;

import vehicle.Vehicle;

public class ParkingSlot {

	// UML Diagram attribute/method visibility
	// public    -> +
	// protected -> #
	// private   -> -
	public int publicValue;
	private int width;
	private int length;

	private double cost;

	private boolean available;

	private Vehicle parkedVehicle;

	protected int value;

	public ParkingSlot() {
	}

	public ParkingSlot(double cost) {
		this.cost = cost;
	}

	public int getValue() {
		return value;
	}

	public boolean park(Vehicle vehicle) {
		if (isAvailable()) {
			parkedVehicle = vehicle;
			setAvailable(false);
			return true;
		}
		return false;
	}

	public Vehicle getParkedVehicle() {
		return parkedVehicle;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	private void privateMethod() {

	}
}
