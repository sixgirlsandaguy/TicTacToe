package ru.sixgirlsandaguy.ticTacToe;

public class Move 
{
	private char position;
	
	public Move()
	{
		position = ' ';
	}

	public char getMove()
	{
		return position;
	}

	public char stringToChar(String s)
	{
		return s.charAt(0);
	}
}

