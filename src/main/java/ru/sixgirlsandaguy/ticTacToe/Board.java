package ru.sixgirlsandaguy.ticTacToe;

public class Board {

	public static void main(String[] args) {
				
		Board b = new Board();
			
	} 

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
	
	public char getCell(int N)
	{
		int row = N/3;
		if(N%3 == 0){
			row --;
		}
		int col = N % 3;
		if(col == 0){
			col = 3;
		}
		col--;
		
		
		return board[row][col];
	}

}


