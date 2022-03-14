package org.bike;

//Override using Interfaces

public class ktm implements Bike{

	public static void main(String[] args) {
		ktm k = new ktm();
		k.cost();
		k.speed();
	}

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("Cost of KTM 390 Model : INR 3,10,000");
		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Speed of KTM 390 Bike : 170 km/hour");
		
		
	}
}


