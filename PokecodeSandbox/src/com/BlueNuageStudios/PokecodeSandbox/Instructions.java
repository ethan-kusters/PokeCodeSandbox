package com.BlueNuageStudios.PokecodeSandbox;

public class Instructions extends BackendInstructions
{
	
	//This is where your settings will go:
	public Instructions(MainClass mainClass){
		//IGNORE THIS:
		getClass(mainClass); 
		//Settings here:
		setGender("male");
	}
	
	//Put variables here:
	int example = 0;
	
	//Write instructions here:
	public void instructions()
	{
		for(int i = 0; i < 5; i++)
		{
			dropBall();
			moveRight();
		}
		for(int i = 0; i < 5; i++)
		{
			removeLeft();
			moveLeft();
		}
		
	}

}

