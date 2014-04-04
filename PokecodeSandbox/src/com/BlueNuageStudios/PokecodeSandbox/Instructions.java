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
		for(int i = 0; i < 4; i++)
		{
			dropPot();
			moveUp();
		}
		for(int i = 0; i < 4; i++)
		{
			dropBush();
			moveRight();
		}
		for(int i = 0; i < 4; i++)
		{
			dropFlower();
			moveDown();
		}
		for(int i = 0; i < 3; i++)
		{
			dropBall();
			moveLeft();
		}
		dropBall();
		moveDown();
		

		
	}

}

