package com.xebia.robotics;

public class Robot {

	int batteryVolts;
	int weightCapacity;
	int distanceCovered;
	boolean scanBar;
	String barCode;
	
	public int getBatteryVolts() {
		return batteryVolts;
	}
	public void setBatteryVolts(int batteryVolts) {
		this.batteryVolts = batteryVolts;
	}
	public int getWeightCapacity() {
		return weightCapacity;
	}
	public void setWeightCapacity(int weightCapacity) {
		this.weightCapacity = weightCapacity;
	}
	public int getDistanceCovered() {
		return distanceCovered;
	}
	public void setDistanceCovered(int distanceCovered) {
		this.distanceCovered = distanceCovered;
	}
	public boolean isScanBar() {
		return scanBar;
	}
	public void setScanBar(boolean scanBar) {
		this.scanBar = scanBar;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	
}
