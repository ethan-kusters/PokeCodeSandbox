package com.BlueNuageStudios.PokecodeSandbox;

public class Instructions extends BackendInstructions{
	
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
		while(example < 4)
		{
			moveUp();
			example = example + 1;
		}
		
	}

}

