
public class PaymentContext {

	private PaymentStrategy paystrat;

	public void setPaymentStrategy(PaymentStrategy paystrat) {
		this.paystrat = paystrat;
	}

	public void makePayment(double amount) {
		paystrat.pay(amount);
	}
}
