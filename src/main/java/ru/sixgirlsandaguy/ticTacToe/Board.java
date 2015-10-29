package ru.sixgirlsandaguy.ticTacToe;

public class Board {

	public static int dim = 3;
	private	char[][] board;

	public Board() 
	{
		board = new char [dim][dim];
		
		char temp = 49;

		for (int i = 0; i < Board.dim; i++)
		{
			for (int j = 0; j < Board.dim; j++)
			{
				
				board[i][j] = temp;
				temp++;
			}
		}
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
		for (int i = 0; i < dim; i++)
		{
			for (int j = 0; j < dim; j++)
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
		for (int i = 0; i < Board.dim; i++)
		{
			for (int j = 0; j < Board.dim; j++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}


