
public class Test {
	public static void main(String[] args) {

		Computer cmp1 = new Computer.ComputerBuilder().setCPU("i5 10th gen").setRAM(8).setStorage(256).build();
		System.out.println(cmp1);

		Computer cmp2 = new Computer.ComputerBuilder().setCPU("i5 12th gen").setStorage(1024).build();
		System.out.println(cmp2);

	}
}
