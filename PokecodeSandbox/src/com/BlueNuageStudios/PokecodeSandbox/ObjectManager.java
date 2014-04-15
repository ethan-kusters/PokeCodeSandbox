package com.BlueNuageStudios.PokecodeSandbox;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;


public class ObjectManager {
	Texture spriteSheet;
	PlaceableObject[][] objects;
	ArrayList<Vector2> occupiedLocations = new ArrayList<Vector2>();
	PlaceableObject currentObject;
	Sprite objectSprite;
	ArrayList<Integer> usedLetters = new ArrayList<Integer>();
	String testString = "test";
	public ObjectManager(Texture spriteSheet, Vector2 mapSize)
	{
		this.spriteSheet = spriteSheet;
		objects = new PlaceableObject[(int)mapSize.x][(int)mapSize.y];
	}
	
	public void addObject(String objectName, Vector2 location)
	{
		if(objectName.equals("POKEBALL"))
		{
			objects[(int)location.x][(int)location.y] = (new PlaceableObject(new TextureRegion(spriteSheet, 320, 1664, 64, 64), location, true));
			occupiedLocations.add(location);
		}
		else if(objectName.equals("POTTEDPLANT"))
		{
			objects[(int)location.x][(int)location.y] = (new PlaceableObject(new TextureRegion(spriteSheet, 0, 384, 64, 64), location, true));
			occupiedLocations.add(location);
		}
		else if(objectName.equals("BUSH"))
		{
			objects[(int)location.x][(int)location.y] = (new PlaceableObject(new TextureRegion(spriteSheet, 64, 384, 64, 64), location, true));
			occupiedLocations.add(location);
		}
		else if(objectName.equals("FLOWER"))
		{
			objects[(int)location.x][(int)location.y] = (new PlaceableObject(new TextureRegion(spriteSheet, 320, 896, 64, 64), location, false));
			occupiedLocations.add(location);
		}
		else if(objectName.equals("TREE"))
		{
			objects[(int)location.x][(int)location.y] = (new PlaceableObject(new TextureRegion(spriteSheet, 448, 896, 64, 64), location, true));
			occupiedLocations.add(location);
		}
		
	}
	
	public void draw(SpriteBatch batch)
	{
		for(Vector2 objectsLocation: occupiedLocations)
		{
			currentObject = objects[(int)objectsLocation.x][(int)objectsLocation.y];
			
			if(!currentObject.justAdded())
			{
				objectSprite = new Sprite(currentObject.getImage());
				objectSprite.setPosition(currentObject.getLocation().x * 64, currentObject.getLocation().y * 64);
				objectSprite.draw(batch, currentObject.getTransparency());
				
				if(currentObject.getTransparency() < 0.99f)
					currentObject.transparency += 0.015f;
			}
		}
	}
	
	public void removeObject(Vector2 location)
	{
		if(objects[(int)location.x][(int)location.y] != null)
		{
			objects[(int)location.x][(int)location.y] = null;
		}
	}
	
	public void update()
	{
		for(Vector2 objectsLocation: occupiedLocations)
		{
			currentObject = objects[(int)objectsLocation.x][(int)objectsLocation.y];
			
			if(currentObject.justAdded() && currentObject.waitCounter == 0)
				currentObject.justAdded = false;
			else if(currentObject.waitCounter > 0)
					currentObject.waitCounter--;
		}
	}
	
	
}
