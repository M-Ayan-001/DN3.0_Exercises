public class Test {

	public static void main(String[] args) {
		FutureValueCalculator fvc = new FutureValueCalculator();
		System.out.println(fvc.RecursiveCalculate(500, 10, 4, 1));
		System.out.println(fvc.IterativeCalculate(500, 10, 4, 1));

	}

}