package ru.sixgirlsandaguy.ticTacToe;

public class Result
{    
	private int ROWS = 3;
	private int COLUMNS = 3;

	public boolean isWinner(char player, char[][] board)
	{
		int count = 0;
		int k = 0;

		//CHECK VERTICAL
		for(int i = 0; i < ROWS; i++)
		{
			count = 0;
			for(int j = 0; j < COLUMNS; j++)
			{
				if(board[i][j] == player)
				{
					count++;
					if(count >= 3)
					{
						return true;
					}
				}

			}
		}

		//CHECK HORIZONTAL
		for(int i = 0; i < ROWS; i++)
		{
			count = 0;
			for(int j = 0; j < COLUMNS; j++)
			{
				if(board[j][i] == player)
				{
					count++;
					if(count >= 3)
					{
						return true;
					}
				}
			}
		}

		count = 0;

		//CHECK 1 5 9
		for(int i = 0; i < ROWS; i++)
		{
			if(board[i][i] == player)
			{
				count++;
				if(count >= 3)
				{
					return true;
				}
			}
		}

		count = 0;
		k = 2;

		//CHECK 3 5 7
		for(int i = 0; i < ROWS; i++)
		{
			if(board[k][i] == player)
			{
				count++;
				if(count >= 3)
				{
					return true;
				}
			}
			k--;
		}
		return false;
	}
}
