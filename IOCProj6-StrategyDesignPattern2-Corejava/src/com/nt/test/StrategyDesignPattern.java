package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDesignPattern {
 public static void main(String[] args) {
	Flipkart fpkt=null;
	try {
		//get target class object
	fpkt=FlipkartFactory.getInstance();
	}//try
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("Problem in dependency management.....");
	}
    System.out.println(fpkt.shopping(new String[] {"rain coat", "umbrella","flutablets"},new float[] {5000,2000,500})); 
  }//main
}//class
