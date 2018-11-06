package device;

public abstract class SmartDevice {

	private int id;
	private String name;
	private boolean turnedOn;

	public SmartDevice(int id) {
		this.id = id;
	}

	public void helloWorld() {
		doSomething();
		System.out.println("Hello world");
	}

	public abstract void doSomething();

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
