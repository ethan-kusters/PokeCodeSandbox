package com.BlueNuageStudios.PokecodeSandbox;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class PlaceableObject {
	
	TextureRegion objectImage;
	Vector2 objectLocation;
	boolean justAdded = true;
	boolean remove = false;
	int waitCounter = 1;
	float transparency = 0;
	boolean collideable;
	
	public PlaceableObject(TextureRegion objectImage, Vector2 objectLocation, Boolean collideable)
	{
		this.objectImage = objectImage;
		this.objectLocation = objectLocation;
		this.collideable = collideable;
	}
	
	public Vector2 getLocation()
	{
		return objectLocation;
	}
	
	public TextureRegion getImage()
	{
		return objectImage;
	}
	
	public Boolean justAdded()
	{
		return justAdded;
	}
	
	public float getTransparency()
	{
		return transparency;
	}
}
