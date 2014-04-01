package com.BlueNuageStudios.PokecodeSandbox;

import java.util.Random;

public class Room {
	public int width;
	public int height;
	int[][] roomArray;
	Random rand = new Random();
	public Room(int sentWidth, int sentHeight)
	{
		height = sentWidth;
		width = sentHeight;
		roomArray = createRoom(width, height);
	}
	
	public int[][] createRoom(int width, int height)
	{
		int[][] roomTiles = new int[height][width];
		boolean addedSomething = false;
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				if(i == 0 && j == 0) //bottomLeftCorner
				{
					roomTiles[i][j] = 7;
				}
				else if(i == 0 && j == (width - 1)) //upperLeftCorner
				{
					roomTiles[i][j] = 5;
				}
				else if(i == height - 1 && j == 0) //bottomRightCorner
				{
					roomTiles[i][j] = 8;
				}
				else if(i == height - 1 && j == width - 1) //upperRightCorner
				{
					roomTiles[i][j] = 6;
				}
				else if(i == 0) //Top horizontal tiles
				{
					roomTiles[i][j] = 3;
				}
				else if(i == height - 1) //Bottom horizantal tiles
				{
					roomTiles[i][j] = 4;
				}
				else if(j == 0) //Left vertical tiles
				{
					roomTiles[i][j] = 2;
				}
				else if(j == width - 1) //Right vertical tiles
				{
					roomTiles[i][j] = 1;
				}
				else
				{
					roomTiles[i][j] = 0;
				}
			}
			
			
			
		}
		return roomTiles;
	}
}
