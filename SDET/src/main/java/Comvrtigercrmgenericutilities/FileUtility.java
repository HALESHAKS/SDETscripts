package Comvrtigercrmgenericutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	
	public String getPropertykeyvalues(String key) throws IOException
	{
	FileInputStream fis = new FileInputStream(".\\TestData\\commondata.properties");
	Properties prop = new Properties();
	prop.load(fis);
	return prop.getProperty(key);
	}
	public static void main(String[] args) throws IOException {
		       System.out.println(new FileUtility().getPropertykeyvalues("browser"));
				System.out.println(new FileUtility().getPropertykeyvalues("url"));
				System.out.println(new FileUtility().getPropertykeyvalues("username"));
				System.out.println(new FileUtility().getPropertykeyvalues("password"));

	}

}
