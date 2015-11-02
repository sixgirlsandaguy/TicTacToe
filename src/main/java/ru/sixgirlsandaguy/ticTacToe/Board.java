package ru.sixgirlsandaguy.ticTacToe;

public class Board {

	private int DIM = 3;
	private	char[][] board;

	public Board() 
	{
		board = new char [DIM][DIM];
		
		char temp = 49;

		for (int i = 0; i < DIM; i++)
		{
			for (int j = 0; j < DIM; j++)
			{
				
				board[i][j] = temp;
				temp++;
			}
		}
	}

	public int boardCounter() 
	{
		int count = 0;
		for (int i = 0; i < DIM; i++)
		{
			for (int j = 0; j < DIM; j++)
			{
				if (Character.isDigit(board[i][j]))
				{
					count++;
				}
			}
		}
		
		return count;
	}

	public char[][] getBoard() 
	{
		return board;
	}
	
	public void setCell(char player, int N)
	{
		int [] pos = cell_help(N);
		
		board[pos[0]][pos[1]] = player;
	}
	
	public char getCell(int N)
	{
		int [] pos = cell_help(N);
		
		return board[pos[0]][pos[1]];
	}
	
	private int[] cell_help(int N)
	{
		
		int [] res = new int[2];
		int row = N/3;
		if(N%3 == 0){
			row --;
		}
		int col = N % 3;
		if(col == 0){
			col = 3;
		}
		col--;
		
		res[0] = row;
		res[1] = col;
		
		return res;
	}
	
	public boolean isOccupied(int N)
	{
		int [] pos = cell_help(N);
		
		if (board[pos[0]][pos[1]] == 'X' || board[pos[0]][pos[1]] == 'O')
		{
			return true;
		}
		
		return false;
	}

	public boolean isFull()
	{
		for (int i = 0; i < DIM; i++)
		{
			for (int j = 0; j < DIM; j++)
			{
				if (board[i][j] != 'X' && board[i][j] != 'O')
				{
					return false;
				}
			}
		}
		
		return true;
	}
	

	public void printBoard() 
	{
		for (int i = 0; i < DIM; i++)
		{
			for (int j = 0; j < DIM; j++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}


