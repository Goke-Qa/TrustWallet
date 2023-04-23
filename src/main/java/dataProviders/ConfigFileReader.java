//package dataProviders;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Properties;
//
//public class ConfigFileReader {
//	
//	private Properties properties;
////	private final String propertyFilePath = getPropertyFilePath();
//	
//////	public ConfigFileReader() {
//////		BufferedReader reader;
//////		try {
//////			reader = new BufferedReader(new FileReader(propertyFilePath));
//////			properties = new Properties();
//////			try {
//////				properties.load(reader);
//////				reader.close();
//////			} catch (IOException e) {
//////				e.printStackTrace();
//////			}
//////		} catch (FileNotFoundException e) {
//////			e.printStackTrace();
//////			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
////		}
////	}
//	
////	private String getPropertyFilePath() {
////		String profileId = System.getProperty("profileId");
////		if (profileId == null) profileId = "prod";
////		return "src//test//resources//profiles" + profileId + "Configuration.properties";
////	}
//	
//	public String getValidUsername() {
//		return getProperty("validUsername");
//	}
//	
//	private String getProperty(String prop) {
//		String property = properties.getProperty(prop);
//		if (property != null) {
//			return property;
//		} else {
//			throw new RuntimeException("'" + prop + "' property not specified in the Configuration.properties file");
//		}
//	}
//
//}
