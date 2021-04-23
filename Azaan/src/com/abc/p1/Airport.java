package com.abc.p1;

public class Airport {
	
	public void allow(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
		ref.demo();
		System.out.println("-----------------");
	}

}
