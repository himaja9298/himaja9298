package com.nt.comp;

public class CEATTyre implements Tyre {
  public CEATTyre() { 
	System.out.println("MRFtyre::0-param constructor");
  }
	@Override
	public String roadGrip() {
		return "CEATtyre::smooth road grip-->suitable for any transportation";
	}

}
