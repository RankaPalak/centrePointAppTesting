package readDesiredCapabilities;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;  


public class readDesiredCapabilities {

	HashMap<String, String> map=new HashMap<String, String>();  

	InputStream inputStream;

	public HashMap<String, String> getPropValues() throws IOException {

		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";

			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}

			map.put("DEVICE_NAME",prop.getProperty("DEVICE_NAME"));  
			map.put("PLATFORM_VERSION",prop.getProperty("PLATFORM_VERSION"));  
			map.put("PLATFORM_NAME",prop.getProperty("PLATFORM_NAME"));  
			map.put("AUTOMATION_NAME",prop.getProperty("AUTOMATION_NAME"));  
			map.put("APP_ACTIVITY",prop.getProperty("APP_ACTIVITY"));  
			map.put("WAIT_ACTIVITY",prop.getProperty("WAIT_ACTIVITY"));  
			map.put("FILE_DIR",prop.getProperty("FILE_DIR"));  
			map.put("APK_NAME",prop.getProperty("APK_NAME"));  
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return map;
	}




}
