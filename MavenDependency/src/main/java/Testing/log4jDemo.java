package Testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDemo {
	
	public static Logger logger= LogManager.getLogger(log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println(" /n Hello World...!  /n");
		
		logger.info("This is information message");
		logger.warn("This is warning message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");
		
		System.out.println(" \n Completed");

	}

}
