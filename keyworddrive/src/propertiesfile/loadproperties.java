package propertiesfile;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.util.Properties;

	public class loadproperties {

		Properties p = new Properties();
	 
		public Properties getObjectRepository() throws IOException{
			//Read object repository file
			File f=new File("C:\\Users\\NSSS KKISHORE\\Desktop\\Bhargav\\Selenium_WorkSpace\\keyworddrive\\config.properties");
			InputStream stream = new FileInputStream(f);
			//load all objects
			p.load(stream);
			 return p;
		}
		
	


}
