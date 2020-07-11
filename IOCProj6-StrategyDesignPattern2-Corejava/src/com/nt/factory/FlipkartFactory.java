package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.Flipkart;
import com.nt.comp.courier;

public class FlipkartFactory {
	private static Properties props;
	static{
		InputStream is=null;
		try {
           //locate properties using streams
			is=new FileInputStream("src/com/nt/commons/info.properties");
	        //load properties file into java.util.properties object
			props=new Properties();
			props.load(is);
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//static
	public static Flipkart getInstance()throws Exception {
		courier courier=null;
		Flipkart fpkt=null;
		//get dependent class and create dependent class object
		courier=(courier)Class.forName(props.getProperty("sdp.dependent")).newInstance();
		//create target class object
		fpkt=new Flipkart();
		//assign dependent class object to target class object
		fpkt.setCourier(courier);
		return fpkt;
	  }

}
