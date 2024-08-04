
public class SMSNotifierDecorator extends NotifierDecorator {

	public SMSNotifierDecorator(Notifier notification) {
		super(notification);
	}

	@Override
	public String send() {
		return "SMS Notification : " + super.send();
	}

}
