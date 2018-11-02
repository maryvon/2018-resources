package device;

public class SmartLightBulb extends SmartDevice {

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
	public void setIntensity(Integer intensity) {
		this.intensity = intensity;
	}

	@Override
	public String getStatus() {
		StringBuilder stringBuilder = new StringBuilder(super.getStatus());
		return stringBuilder.append(", color=")
							.append(color)
							.append(", intensity=")
							.append(intensity)
							.toString();
	}
}
