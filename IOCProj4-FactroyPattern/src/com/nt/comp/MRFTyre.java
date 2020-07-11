package com.nt.comp;

public class MRFTyre implements Tyre {
  public MRFTyre() { 
	System.out.println("MRFtyre::0-param constructor");
  }
	@Override
	public String roadGrip() {
		return "MRFtyre::super road grip-->suitable for any transportation";
	}

}
