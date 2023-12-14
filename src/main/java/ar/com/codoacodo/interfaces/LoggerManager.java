package ar.com.codoacodo.interfaces;

public class LoggerManager {
	private String target;
	public static ILogger getLogger(String target) {
		
		ILogger logger;
		switch (target) {
			case "A":
				logger = new SMSLogger();
				((SMSLogger)logger).setNumber("3132123");
				break;
			case "B":
				logger = new FSLogger();
				break;
			case "C":
				logger = new EmailLogger();
				break;
			default:
				logger = null;
		}
		return logger;
	}
	
	public LoggerManager(String target) {
		this.target = target;
	}
	
	public ILogger getLogger() {
		
		ILogger logger;
		switch (this.target) {
			case "A":
				logger = new SMSLogger();
				((SMSLogger)logger).setNumber("3132123");
				break;
			case "B":
				logger = new FSLogger();
				break;
			case "C":
				logger = new EmailLogger();
				break;
			default:
				logger = null;
		}
		return logger;
	}
}
