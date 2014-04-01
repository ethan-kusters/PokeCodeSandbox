package com.BlueNuageStudios.PokecodeSandbox;

import com.BlueNuageStudios.PokecodeSandbox.MainClass;
import com.badlogic.gdx.math.Vector2;

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
	public void teleport(int x, int y)
	{
		mainClass.instructionSet.add("TELEPORT");
		mainClass.teleportValues.add(new Vector2(x, y));
	}
	public void dropBall()
	{
		mainClass.instructionSet.add("POKEBALL");
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
