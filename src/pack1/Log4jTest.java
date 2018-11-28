package pack1;

import org.apache.log4j.LogManager; 
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.io.*;

public class Log4jTest{

  static Logger log = LogManager.getLogger(Log4jTest.class.getName());
 
  public static void main(String[] args)  throws IOException {
	  	DOMConfigurator.configure("log4j.xml");
  		log.trace("Trace Message!");
  		log.debug("Debug Message!");
  		log.info("Info Message!");
  		log.warn("Warn Message!");
  		log.error("Error Message!");
  		log.fatal("Fatal Message!");
  }
}
