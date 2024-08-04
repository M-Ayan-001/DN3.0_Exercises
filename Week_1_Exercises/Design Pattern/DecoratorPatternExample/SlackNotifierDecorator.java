
public class SlackNotifierDecorator extends NotifierDecorator {

	public SlackNotifierDecorator(Notifier notification) {
		super(notification);
	}

	@Override
	public String send() {
		return "Slack Notification : " + super.send();
	}

}
