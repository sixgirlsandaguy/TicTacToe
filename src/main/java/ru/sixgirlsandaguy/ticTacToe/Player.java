package ru.sixgirlsandaguy.ticTacToe;

public class Player
{
	private char token;

	public Player()
	{
		token = ' ';
	}

	public Player(char c)
	{
		token = c;
	}

	//set player token as c
	public void setPlayer(char c)
	{
		this.token = c;
	}

	//returns the players token
	public char getPlayer()
	{
		return this.token;
	}
}
