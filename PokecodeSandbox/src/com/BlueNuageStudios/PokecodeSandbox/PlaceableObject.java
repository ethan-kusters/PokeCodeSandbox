package com.BlueNuageStudios.PokecodeSandbox;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class PlaceableObject {
	
	TextureRegion objectImage;
	Vector2 objectLocation;
	boolean justAdded = true;
	int waitCounter = 1;
	
	public PlaceableObject(TextureRegion objectImage, Vector2 objectLocation)
	{
		this.objectImage = objectImage;
		this.objectLocation = objectLocation;
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
}
