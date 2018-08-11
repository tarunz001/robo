package com.xebia.robotics.utilities;

import com.xebia.robotics.Robot;

public class RoboUtilitiesImpl implements RoboUtilties {

	@Override
	public int checkBatteryStatus(Robot robo) {
		
		if(robo.getBatteryVolts()<=15)
		{
			try {
				throw new Exception("Battery Less than 15% !!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			
			try{
				return robo.getBatteryVolts();	
			}
			catch(Exception e){

				e.printStackTrace();
			}
			
		}
		
		return 0;
	}

	@Override
	public int checkWeightCapacityStatus(Robot robo) {
		
		if(robo.getWeightCapacity()>=10)
		{
			try {
				throw new Exception("Alarm: Overweight");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			
			try{
				return robo.getWeightCapacity();	
			}
			catch(Exception e){

				e.printStackTrace();
			}
			
		}
		
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
