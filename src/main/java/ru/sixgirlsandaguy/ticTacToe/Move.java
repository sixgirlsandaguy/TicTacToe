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

	public boolean isValid(String move)
	{
		if(move.length() > 1)
		{
			return false;
		}
		else if( move.equals("0"))
		{
			return false;
		}


		if(Character.isDigit(stringToChar(move)))
		{
			return true;
		}

		return false;
	}
}
