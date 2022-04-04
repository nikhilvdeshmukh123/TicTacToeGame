package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {

	char[] board = new char[10];
	static char player;
	static char computer;
	static Scanner scan = new Scanner(System.in);

	public char[] createBoard() {
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	public void getPlayerInput() {
		System.out.println("Choose Letter X or O: ");
		String input = scan.nextLine();
		player = Character.toUpperCase(input.charAt(0));

		if (player == 'X') {
			computer = 'O';
		} else if (player == 'O') {
			computer = 'X';
		} else {
			System.out.println("Choose Valid Letter");
		}
		
		System.out.println("Player choice: " + player);
		System.out.println("Computer choice: " + computer);
	}
}