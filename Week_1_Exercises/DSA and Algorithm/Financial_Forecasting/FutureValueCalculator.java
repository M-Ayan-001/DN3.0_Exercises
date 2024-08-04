
public class FutureValueCalculator {

	public double RecursiveCalculate(double principalAmount, double interestRate, int year, double interest) {
		if (year == 0) {
			return principalAmount * interest;
		}
		interest = interest * (1 + interestRate / 100);
		return RecursiveCalculate(principalAmount, interestRate, year - 1, interest);
	}

	public double IterativeCalculate(double principalAmount, double interestRate, int years, double interest) {
		for (int i = 0; i < years; i++) {
			interest = interest * (1 + interestRate / 100);
		}
		return principalAmount * interest;
	}

}
