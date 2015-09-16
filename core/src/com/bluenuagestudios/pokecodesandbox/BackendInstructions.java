package com.bluenuagestudios.pokecodesandbox;

import com.badlogic.gdx.math.Vector2;
import com.bluenuagestudios.pokecodesandbox.MainClass;

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
	public void dropPot()
	{
		mainClass.instructionSet.add("POTTEDPLANT");
	}
	public void dropBush()
	{
		mainClass.instructionSet.add("BUSH");
	}
	public void dropFlower()
	{
		mainClass.instructionSet.add("FLOWER");
	}
	public void dropTree()
	{
		mainClass.instructionSet.add("TREE");
	}
	
	public void removeUp()
	{
		mainClass.instructionSet.add("REMOVEUP");
	}
	public void removeDown()
	{
		mainClass.instructionSet.add("REMOVEDOWN");
	}
	public void removeLeft()
	{
		mainClass.instructionSet.add("REMOVELEFT");
	}
	public void removeRight()
	{
		mainClass.instructionSet.add("REMOVERIGHT");
	}
	
	public void checkLeft()
	{
		mainClass.instructionSet.add("CHECKLEFT");
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
	
	public Vector2 getMapSize()
	{
		return mainClass.mapSize;
	}
	
	public boolean isLocationEmpty(Vector2 location)
	{
		return mainClass.locationEmpty(location);
	}
	
	public boolean isLocationInBounds(Vector2 location)
	{
		return mainClass.locationInBounds(location);
	}
	
	
}
