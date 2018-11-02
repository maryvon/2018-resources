package device;

public class SmartThermometer extends SmartDevice {

	private double temperature;

	public SmartThermometer(int id) {
		super(id);
	}

	public double getTemperature() {
		return temperature;
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
}
