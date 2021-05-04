package com.fantest;

/**
 * @author Raman Ahuja
 * 
 *         Class for a ceiling fan
 *
 */
public class CeilingFan {

	// data member for Ceiling Fan class
	protected int blades;
	private boolean direction;
	private int speedLevel;

	// ctor
	public CeilingFan() {
		this.blades = 3;
		this.direction = Boolean.TRUE;
		this.speedLevel = 0;
	}

	/**
	 * Method to change the speed of the FAN
	 */
	public void pullCord1() {
		if (this.speedLevel == 2) {
			this.speedLevel = 0;
		} else {
			++this.speedLevel;
		}
		switch (this.speedLevel) {
		case 1:
			this.speedLevel = 1;
			break;
		case 2:
			this.speedLevel = 2;
			break;
		default:
			this.speedLevel = 0;
			break;
		}
		spin();
	}

	/**
	 * Method to change the direction of the FAN
	 */
	public void pullCord2() {
		this.direction = !this.direction;
		spin();
	}

	/**
	 * Spin the Fan with the speed and direction set
	 */
	private void spin() {
		if (this.speedLevel == 0) {
			System.out.println("Fan is stopped");
			return;
		}
		if (this.direction) {
			// spin clockwise
			System.out.println("Fan spinning clockwise at speed :" + this.speedLevel);

		} else {
			// spin anti-clockwise
			System.out.println("Fan spinning anti-clockwise at speed :" + this.speedLevel);

		}
	}

	/**
	 * @return the number of blades in the Fan
	 */
	public int getBlades() {
		return blades;
	}

	/**
	 * @return the current direction of the fan
	 */
	public boolean isDirection() {
		return direction;
	}

	/**
	 * @return the speed level of the fan
	 */
	public int getSpeedLevel() {
		return speedLevel;
	}

	@Override
	public String toString() {
		return "CeilingFan [blades=" + blades + ", direction=" + direction + ", speedLevel=" + speedLevel + "]";
	}

}
