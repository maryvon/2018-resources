package room;

import org.junit.Assert;
import org.junit.Test;

public class RoomTest {


	@Test
	public void testEquals() {
		Room firstRoom = new Room();
		firstRoom.setName("a");
		Room secondRoom = new Room();
		secondRoom.setName("a");

		Assert.assertFalse(firstRoom == secondRoom);

		Assert.assertTrue(firstRoom.equals(secondRoom));
	}

}
