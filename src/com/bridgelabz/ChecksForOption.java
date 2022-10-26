package com.bridgelabz;

public class ChecksForOption {

	public static void main(String[] args) {

		System.out.println("Starting of Snake and Ladder Game");
		final int NoPlay = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		//variables
		int die = (int)((Math.random()*10) % 6);
		int position =(int)((Math.random()*10) %3 );
		int playerCurrentPosition = 0;
		switch(position)
		{
		case 0: 
			playerCurrentPosition = NoPlay;
			System.out.println("No Movement");
			break;
		case 1: 
			playerCurrentPosition = LADDER;
			playerCurrentPosition += die;
			System.out.println("Ladder move forward " + playerCurrentPosition);
			break;
		case 2:
			playerCurrentPosition = SNAKE ;
			playerCurrentPosition -= die;
			System.out.println("Snakes move backward "+ playerCurrentPosition);
			break;
		default :
			playerCurrentPosition += die;
			System.out.println("Movement to " +playerCurrentPosition );
		}

	}

}
