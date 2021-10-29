package com.demo.app.test.reusable;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
	
	private static final String appConfigFilePath = "./testproperties/appconfig.properties";

	public static String getPropValue(String propKey) throws Exception {

		File file = new File(appConfigFilePath);
		FileInputStream fileInputStream = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		return properties.getProperty(propKey);
	}

	public Long getTimeout() throws Exception {
		String timeout = getPropValue("timeout");
		return Long.parseLong(timeout);
	}

}
