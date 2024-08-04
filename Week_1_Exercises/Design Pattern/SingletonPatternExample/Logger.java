
public class Logger {

	private Logger() {

	}

	private static Logger log;

	public static Logger getInstance() {

		if (log == null) {
			synchronized (Logger.class) {
				if (log == null) {
					log = new Logger();
				}
			}
		}

		return log;

	}

}
