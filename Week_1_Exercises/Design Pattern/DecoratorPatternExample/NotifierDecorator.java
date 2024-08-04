
public abstract class NotifierDecorator implements Notifier {
	protected Notifier notification;

	public NotifierDecorator(Notifier notification) {
		this.notification = notification;
	}

	public String send() {
		return notification.send();
	}
}
