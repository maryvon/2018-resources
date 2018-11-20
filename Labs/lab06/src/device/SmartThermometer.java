package device;

public class SmartThermometer extends SmartDevice {

	private double temperature;

	public SmartThermometer(int id) {
		super(id);
	}

	public double getTemperature() {
		return temperature;
	}

	public void testNameClash() {
		test();
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String getStatus() {
		StringBuilder stringBuilder = new StringBuilder(super.getStatus());
		return stringBuilder.append(", temperature=")
							.append(temperature)
							.toString();
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

		System.out.println("Initializing thermometer");
	}

	@Override
	public void mount() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pair() {
		// TODO Auto-generated method stub

	}
}
