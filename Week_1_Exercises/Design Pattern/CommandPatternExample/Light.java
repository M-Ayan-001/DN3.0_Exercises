
public class Light {

	private String name;

	public Light(String name) {
		this.name = name;
	}

	public void turnOn() {
		System.out.println(name + " is turned On");
	}

	public void turnOff() {
		System.out.println(name + " is turned Off");
	}

}
