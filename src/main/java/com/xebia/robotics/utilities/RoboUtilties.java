package com.xebia.robotics.utilities;

import com.xebia.robotics.Robot;

public interface RoboUtilties {

	public int checkBatteryStatus(Robot robo);
	
	public int checkWeightCapacityStatus(Robot robo);
	
	public void scanBarCode(BarCodeScanner barCode);
	
}
