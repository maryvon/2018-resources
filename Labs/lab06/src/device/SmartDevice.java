package device;

public abstract class SmartDevice implements Bluetooth, Mountable {

	private int id;
	private String name;
	private boolean turnedOn;

	public SmartDevice(int id) {
		this.id = id;
	}

	public abstract void initialize();

	public void helloWorld() {
		initialize();
		System.out.println("Hello world");
	}

	public void turnOn() {
		turnedOn = true;
	}

	public void turnOff() {
		turnedOn = false;
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return id;
	}

	public String getStatus() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append("Device specs: id=")
						 .append(id)
						 .append(", name=")
						 .append(name)
						 .append(", turnedOn=")
						 .append(turnedOn)
						 .toString();
	}
}
