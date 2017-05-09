package com.haripriya.practice;

class DrumKitTest {
	
	boolean topHat = true;
	boolean snare = true;
	
	void playtopHat(){
		System.out.println("Bang Bang***");
	}
	
	void playsnare(){
		System.out.println("Dabang Dabang!!!");
	}
}

class DrumKit{
	public static void main(String[] args){
		DrumKitTest d = new DrumKitTest();
		d.snare = false;
		d.playsnare();
		d.playtopHat();
		if(d.snare== true){
			d.playsnare();
		}
	}
}