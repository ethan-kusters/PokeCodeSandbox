package com.BlueNuageStudios.PokecodeSandbox;

public class Instructions extends BackendInstructions{
	
	//This is where your settings will go:
	public Instructions(MainClass mainClass){
		//IGNORE THIS:
		getClass(mainClass); 
		
		//Settings here:
		setRepeat(false);
		setGender("female");
	}
	
	//Write instructions here:
	public void instructions()
	{
		moveUp();
		moveLeft();
		moveDown();
		moveDown();
		moveRight();
		moveUp();
	}

}

