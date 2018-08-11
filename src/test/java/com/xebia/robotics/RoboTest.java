package com.xebia.robotics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.xebia.robotics.utilities.RoboUtilitiesImpl;
import com.xebia.robotics.utilities.RoboUtilties;

public class RoboTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	Robot robo;
	static RoboUtilties roboUtils=new RoboUtilitiesImpl();
	@Before
	public void initRobo()
	{
		robo=new Robot();
		robo.setBarCode("dssdxce32");
		robo.setBatteryVolts(100);
		robo.setDistanceCovered(5);
		robo.setWeightCapacity(17);
		
	}
	
	@Test
	public void testRobo()
	{
		if(roboUtils.checkRoboStatus(robo)==null)
			fail("Your Robo Has Issues");

	}
	

}
