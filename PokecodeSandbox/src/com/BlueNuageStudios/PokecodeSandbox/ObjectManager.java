package com.BlueNuageStudios.PokecodeSandbox;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;


public class ObjectManager {
	Texture spriteSheet;
	PlaceableObject[][] objects;
	ArrayList<Vector2> occupiedLocations = new ArrayList<Vector2>();
	PlaceableObject currentObject;
	
	public ObjectManager(Texture spriteSheet, Vector2 mapSize)
	{
		this.spriteSheet = spriteSheet;
		objects = new PlaceableObject[(int)mapSize.x][(int)mapSize.y];
	}
	
	public void addObject(String objectName, Vector2 location)
	{
		if(objectName.equals("POKEBALL"))
		{
			//objects.add(new PlaceableObject(new TextureRegion(spriteSheet, 320, 1664, 64, 64), location));
			objects[(int)location.x][(int)location.y] = (new PlaceableObject(new TextureRegion(spriteSheet, 320, 1664, 64, 64), location));
			occupiedLocations.add(location);
		}
	}
	
	public void draw(SpriteBatch batch)
	{
		for(Vector2 objectsLocation: occupiedLocations)
		{
			currentObject = objects[(int)objectsLocation.x][(int)objectsLocation.y];
			
			if(!currentObject.justAdded())
				batch.draw(currentObject.getImage(), currentObject.getLocation().x * 64, currentObject.getLocation().y * 64);
			else
				currentObject.justAdded = false;
		}
	}
	
	public void removeObject(Vector2 location)
	{
		if(objects[(int)location.x][(int)location.y] != null)
		{
			objects[(int)location.x][(int)location.y] = null;
		}
	}
	
	
}
