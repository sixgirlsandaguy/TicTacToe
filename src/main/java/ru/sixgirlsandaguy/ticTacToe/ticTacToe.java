package ru.sixgirlsandaguy.ticTacToe;

public class ticTacToe
{
	private Board board;
	private Player p1;
	private Player p2;
	private Move move;
	private Result result;
	
	public ticTacToe()
	{
		board = new Board();
		p1 = new Player('X');
		p2 = new Player('O');
		move = new Move();
		result = new Result();
		
	}
	
	private static void helpP1(ticTacToe game)
	{
		game.move.setMove();
		if(game.board.isOccupied(game.move.getMove()))
		{
			System.out.println("This cell is already taken, please pick a number from the board!");
			game.board.printBoard();
			helpP1(game);
		}
		else
		{
			game.board.setCell(game.p1.getPlayer(), game.move.getMove());
		}
	}
	
	private static void helpP2(ticTacToe game)
	{
		game.move.setMove();
		if(game.board.isOccupied(game.move.getMove()))
		{
			System.out.println("This cell is already taken, please pick a number from the board!");
			game.board.printBoard();
			helpP2(game);
		}
		else
		{
			game.board.setCell(game.p2.getPlayer(), game.move.getMove());
		}
	}

	public static void main(String[] args) 
	{
		boolean winner = false;
		boolean draw = false;
		ticTacToe game = new ticTacToe();
		
		game.board.printBoard();

		do
		{
			if(game.board.isFull())
			{
				draw = true;
				break;
			}
			helpP1(game);
			if(game.result.isWinner(game.p1.getPlayer(), game.board.getBoard()))
			{
				winner = true;
				break;
			}
			game.board.printBoard();
			
			if(game.board.isFull())
			{
				draw = true;
				break;
			}
			helpP2(game);
			if(game.result.isWinner(game.p2.getPlayer(), game.board.getBoard()))
			{
				winner = true;
				break;
			}
			game.board.printBoard();
		}
		while(winner == false || draw == true);
		
		
		if(winner == false)
		{
			System.out.println("It's a draw!");
		}
		else
		{
			game.board.printBoard();
			System.out.println("Congratulation " + game.result.getWinner() + " you won!");
		}		
	}
}
