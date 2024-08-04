
public class Computer {
	private String CPU;
	private int RAM;
	private int Storage;

	private Computer(ComputerBuilder object) {
		this.CPU = object.CPU;
		this.RAM = object.RAM;
		this.Storage = object.Storage;
	}

	public String toString() {
		return "The PC has " + RAM + " GB RAM" + ", " + CPU + " CPU" + " and " + Storage + " GB Storage";
	}

	///////////////////// separation /////////////////////

	public static class ComputerBuilder {
		private String CPU;
		private int RAM;
		private int Storage;

		public ComputerBuilder setCPU(String CPU) {
			this.CPU = CPU;
			return this;
		}

		public ComputerBuilder setRAM(int RAM) {
			this.RAM = RAM;
			return this;
		}

		public ComputerBuilder setStorage(int Storage) {
			this.Storage = Storage;
			return this;
		}

		// builder method
		public Computer build() {
			return new Computer(this);
		}

	}

}
