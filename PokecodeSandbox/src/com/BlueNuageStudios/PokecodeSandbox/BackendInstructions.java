package com.BlueNuageStudios.PokecodeSandbox;

import com.BlueNuageStudios.PokecodeSandbox.MainClass;

public class BackendInstructions{
	
	MainClass mainClass;
	public void getClass(MainClass sentMainClass)
	{
		mainClass = sentMainClass;
	}
	
	public void moveUp()
	{
		mainClass.instructionSet.add("UP");
	}
	public void moveDown()
	{
		mainClass.instructionSet.add("DOWN");
	}
	public void moveLeft()
	{
		mainClass.instructionSet.add("LEFT");
	}
	public void moveRight()
	{
		mainClass.instructionSet.add("RIGHT");
	}
	public void setRepeat(boolean repeat)
	{
		mainClass.repeat = repeat;
	}
	
	public void setGender(String gender)
	{
		mainClass.gender = gender;
		mainClass.changedGender = true;
	}
	
}
