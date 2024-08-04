
public class CardAdapter implements PaymentProcessor {
	private CardGateway card;

	public void transfer(double amount) {
		card = new CardGateway();
		card.setAmount(amount);
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("The amount : " + card.getAmount() + " is paid via CARD");
	}

}
