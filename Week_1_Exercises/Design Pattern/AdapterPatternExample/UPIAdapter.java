
public class UPIAdapter implements PaymentProcessor {
	private UPIGateway upi;

	public void transfer(double amount) {
		upi = new UPIGateway();
		upi.setAmount(amount);
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("The amount : " + upi.getAmount() + " is paid via UPI");
	}

};