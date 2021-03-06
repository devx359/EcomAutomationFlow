/**
 * 
 */
package Utility;

import org.apache.log4j.Logger;

/**
 * @author debo
 *
 */
public class Log {
	
	public static Logger log = Logger.getLogger(Log.class.getName());
	
	public static void startLogForThisCase(String testCaseName)
	{
		Log.info("****************************************************************************************");
	    Log.info("****************************************************************************************");
	    Log.info("$$$$$$$$$$$$$$$$$$$$$      Test Case: "+testCaseName + "       $$$$$$$$$$$$$$$$$$$$$$$$$");
	    Log.info("****************************************************************************************");
	    Log.info("****************************************************************************************");
	}
	
	public static void endLoggForThisCase()
	{
		Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
	    Log.info("X");
	    Log.info("X");
	    Log.info("X");
	    Log.info("X");
	}

	public static void info(String string) {
		 log.info(string);
		
	}
	public static void debug(String string) {
		 log.debug(string);		
	}
	
	public static void error(String string) {
		 log.error(string);		
	}

}
