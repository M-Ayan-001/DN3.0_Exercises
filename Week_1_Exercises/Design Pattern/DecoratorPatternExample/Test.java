
public class Test {

	public static void main(String[] args) {
		Notifier notification1 = new EmailNotifier("You have 1 notification");
		Notifier sms = new SMSNotifierDecorator(notification1);
		System.out.println(sms.send());

		Notifier notification2 = new EmailNotifier("You have 1 notification");
		Notifier slack = new SlackNotifierDecorator(notification2);
		System.out.println(slack.send());
	}

}
