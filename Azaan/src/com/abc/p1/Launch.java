package com.abc.p1;

public class Launch {

	public static void main(String[] args) {
	Airport airport = new Airport();
	CargoPlane cp=new CargoPlane();
	PassangerPlane pp = new PassangerPlane();
	FighterPlane fighterPlane = new FighterPlane();
	airport.allow(cp);
	airport.allow(pp);
	airport.allow(fighterPlane);	
	}

}
