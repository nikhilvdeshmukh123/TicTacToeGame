package com.bridgelabz;

public class TicTacToeGame {

	char[] board = new char[10];

	public char[] createBoard() {
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}
}
