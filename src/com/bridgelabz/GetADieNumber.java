package com.bridgelabz;

public class GetADieNumber {

	public static void main(String[] args) {
		int startPosition = 0;
		System.out.println("Game start and Player is at Position: " +startPosition);
		int die = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("The Number on die is: " + die);
	}

}
