package lab04;

import org.junit.Assert;
import org.junit.Test;

import parking.BusParkingSlot;
import parking.CarParkingSlot;
import parking.ParkingSlot;

public class ParkingSlotTest {

	@Test
	public void testPolymorphism() {
		BusParkingSlot busParkingSlot = new BusParkingSlot();
		Assert.assertEquals(20.0, busParkingSlot.getCost(), 0.001);

		CarParkingSlot firstCarParkingSlot = new CarParkingSlot();
		Assert.assertEquals(10.0, firstCarParkingSlot.getCost(), 0.001);

//		if (firstCarParkingSlot.isAvailable()) {
//
//		}

		CarParkingSlot secondCarParkingSlot = new CarParkingSlot();

		Assert.assertTrue(busParkingSlot instanceof BusParkingSlot);

		Assert.assertTrue(busParkingSlot instanceof ParkingSlot);

		Assert.assertTrue(firstCarParkingSlot instanceof CarParkingSlot);

		Assert.assertTrue(firstCarParkingSlot instanceof Object);

		Assert.assertFalse(firstCarParkingSlot == secondCarParkingSlot);

		Assert.assertFalse(firstCarParkingSlot.equals(secondCarParkingSlot));

		ParkingSlot[] parkingSlots = new ParkingSlot[20];

		for (int i = 0; i < parkingSlots.length; i++) {
			if (parkingSlots[i] instanceof BusParkingSlot) {
				((BusParkingSlot) parkingSlots[i]).busOnlyMethod();
			}
		}
	}
}
