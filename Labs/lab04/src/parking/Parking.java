package parking;

public class Parking implements IParking {

	public ParkingSlot[] parkingSlots = new ParkingSlot[20];
	public CarParkingSlot carParkingSlot = new CarParkingSlot();

	public void drive() {

		for (int i = 0; i < parkingSlots.length; i++) {
			parkingSlots[i] = new ParkingSlot();
			parkingSlots[i].setCost(10.0);
		}

		BusParkingSlot busParkingSlot = new BusParkingSlot();

		CarParkingSlot carParkingSlot = new CarParkingSlot();

		parkingSlots[0] = busParkingSlot;
		parkingSlots[0] = carParkingSlot;
	}
}
