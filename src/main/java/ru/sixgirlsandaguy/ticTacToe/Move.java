package ru.sixgirlsandaguy.ticTacToe;
import java.util.Scanner;

public class Move 
{
	private char position;

	public Move()
	{
		position = ' ';
	}

	public void setMove()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What cell do you want to mark? ");
		String move;
		move = sc.nextLine();
		boolean valid = isValid(move);
		if(valid == false)
		{
			System.out.println("Invalid move, please select a number from  1-9.");
			setMove();
		}

		position = stringToChar(move);
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
