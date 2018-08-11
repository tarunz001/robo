package com.xebia.robotics.utilities;

public class RoboUtilitiesImpl implements RoboUtilties {

	@Override
	public int checkBatteryStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int checkDistanceWalked() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void scanBarCode(BarCodeScanner barCode) {
		if(barCode!=null)
		{
			System.out.println("Thanks. Please provide feedback and Enjoy the Services!");
		}
		
	}

	
}
