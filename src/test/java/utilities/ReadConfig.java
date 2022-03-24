package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;


	public ReadConfig()
	{
		File src= new File("./Configuration/readconfig.properties");
		try {FileInputStream fis = new FileInputStream(src) ;
		pro= new Properties();
		pro.load(fis);

		} 
		catch (Exception e) {
			System.out.print("exception is" +e.getMessage());
		} 

	}

	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getBrowser()
	{
		String browser=pro.getProperty("browser");
		return browser;
	}


}
