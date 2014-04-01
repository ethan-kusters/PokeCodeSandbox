package com.BlueNuageStudios.PokecodeSandbox;
public class Instructions extends BackendInstructions{
	//This is where your settings will go:
	public Instructions(MainClass mainClass){
		//IGNORE THIS:
		getClass(mainClass); 
		
		//Settings here:
		setRepeat(true);
		setGender("male");
	}
	
	//Write instructions here:
	public void instructions()
	{
		teleport(4, 4);
		moveUp();
		moveUp();
	}

}

