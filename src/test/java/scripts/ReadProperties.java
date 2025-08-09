package scripts;

import java.util.Properties;

import utilities.PropUtil;

public class ReadProperties {

	public static void main(String[] args) {
		Properties prop = PropUtil.readData("Config.properties");
		System.out.println("Launch the application using the url: "+prop.getProperty("APP_URL"));

	}

}
