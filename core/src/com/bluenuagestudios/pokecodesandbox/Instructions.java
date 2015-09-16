package com.bluenuagestudios.pokecodesandbox;

public class Instructions extends BackendInstructions
{
	//This is where your settings will go:
	public Instructions(MainClass mainClass){
		//IGNORE THIS:
		getClass(mainClass); 
		//Settings here:
		setRepeat(false);
		setGender("female");
	}
	
	//Put variables here:
	int example = 0;
	int Bob = 15;
	
	//Write instructions here:
	public void instructions()
	{
		moveUp();
		moveDown();
		moveLeft();
		moveRight();
	}
}

