package projectpet;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogManager {
	
	public static Logger logger() {
		Logger log=Logger.getLogger(LogManager.class);
		PropertyConfigurator.configure(".\\src\\main\\resources\\log4j.properties");
		return log;
	}
	

}
