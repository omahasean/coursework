package com.techelevator;

public class Television {
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	public void turnOff() {
		isOn=false;
	}
	public void turnOn() {
		isOn=true;
		currentChannel = 3;
		currentVolume=2;
	}
	public void changeChannel(int newChannel) {
		if(this.isOn()==true) {
			if(newChannel>=3 && newChannel<=18){
				currentChannel=newChannel;
			}
		}
	}
	public void channelUp() {
		if(this.isOn()==true) {
			if(currentChannel>=3 && currentChannel<18) {
				currentChannel+=1;
			}
			else if (currentChannel+1>=18) {
				currentChannel = 3;
			}
		}
	}
	public void channelDown() {
		if (this.isOn() == true) {
			if(currentChannel>3 && currentChannel<=18) {
				currentChannel-=1;
			}
			else if (currentChannel-1<=3) {
				currentChannel = 18;
			}
		}
		else {
			
		}
	}
	public void raiseVolume() {
		if (this.isOn()== true) {
			if(currentVolume+1>=10) {
				currentVolume = 10;
			}
			else {
			currentVolume += 1;
			}
		}
		else {
			
		}
	}
	public void lowerVolume() {
		if (this.isOn()== true) {
			if(currentVolume-1<=0) {
				currentVolume = 0;
			}else {
			currentVolume-=1;
			}
		}
		else {
			
		}
	}
}
