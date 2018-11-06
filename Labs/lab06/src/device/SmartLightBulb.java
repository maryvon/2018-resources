package device;

public class SmartLightBulb extends SmartDevice implements Comparable<SmartLightBulb>, Bluetooth, Mountable {

	private String color;
	private Integer intensity;

	public SmartLightBulb(int id) {
		super(id);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getIntensity() {
		return intensity;
	}

	public Integer getIntensity(int someVariable) {
		return 0;
	}

	public Integer getIntensity(String someVariable) {
		return 0;
	}

	public void setIntensity(Integer intensity) {
		this.intensity = intensity;
	}

	@Override
	public String getStatus() {
		StringBuilder stringBuilder = new StringBuilder(super.getStatus());
		return stringBuilder.append(", color=").append(color).append(", intensity=").append(intensity).toString();
	}

	@Override
	public void doSomething() {
		System.out.println("Light bulb is doing something");
	}

	@Override
	public void pair() {
		// TODO Auto-generated method stub
		Bluetooth.staticTest();
		test();
	}

	@Override
	public void mount() {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(SmartLightBulb o) {
		if (this.getIntensity() == o.getIntensity()) {
			return 0;
		}
		if (this.getIntensity() < o.getIntensity()) {
			return 1;
		}
		return -1;
	}
}
