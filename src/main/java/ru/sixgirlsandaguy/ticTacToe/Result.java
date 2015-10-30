package ru.sixgirlsandaguy.ticTacToe;

public class Result
{    
	private int DIM = 3;
	private char winner;

	public Result()
	{
		winner = ' ';
	}

	public char getWinner()
	{
		return winner;
	}

	public boolean isWinner(char player, char[][] board)
	{
		int count = 0;
		int k = 0;

		//CHECK VERTICAL
		for(int i = 0; i < DIM; i++)
		{
			count = 0;
			for(int j = 0; j < DIM; j++)
			{
				if(board[i][j] == player)
				{
					count++;
					if(count >= 3)
					{
						winner = player;
						return true;
					}
				}

			}
		}

		//CHECK HORIZONTAL
		for(int i = 0; i < DIM; i++)
		{
			count = 0;
			for(int j = 0; j < DIM; j++)
			{
				if(board[j][i] == player)
				{
					count++;
					if(count >= 3)
					{
						winner = player;
						return true;
					}
				}
			}
		}

		count = 0;

		//CHECK 1 5 9
		for(int i = 0; i < DIM; i++)
		{
			if(board[i][i] == player)
			{
				count++;
				if(count >= 3)
				{
					winner = player;
					return true;
				}
			}
		}

		count = 0;
		k = 2;

		//CHECK 3 5 7
		for(int i = 0; i < DIM; i++)
		{
			if(board[k][i] == player)
			{
				count++;
				if(count >= 3)
				{
					winner = player;
					return true;
				}
			}
			k--;
		}
		return false;
	}
}
