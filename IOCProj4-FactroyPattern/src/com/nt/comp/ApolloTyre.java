package com.nt.comp;

public class ApolloTyre implements Tyre {
  public ApolloTyre() { 
	System.out.println("Apollotyre::0-param constructor");
  }
	@Override
	public String roadGrip() {
		return "Apollotyre::standard road grip-->suitable for any transportation";
	}

}
