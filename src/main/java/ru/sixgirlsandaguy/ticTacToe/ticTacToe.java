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

    	public void play(int id)
   	{    	 
    		if (playerTurn() == 'X')
    		{
    			board.setCell(p1.getPlayer(), id);
    		}
    		else
    		{
    			board.setCell(p2.getPlayer(), id); 
    		}
    	}
    
    	public char playerTurn() 
   	 {
    		int i = board.boardCounter();
    	
    		if (i % 2 != 0)
    		{
    			return 'X';
    		}
    		return 'O';
    	}


	public char winner()
    	{
    		if (result.isWinner(p1.getPlayer(), board.getBoard()) == true)
    		{
    			return 'X';
   	 	}
    		else if (result.isWinner(p2.getPlayer(), board.getBoard()) == true)
    		{
    			return 'O';
    		}
    		if (board.isFull())
    		{
        		return 'Z';
    		}
    		return ' ';
    	}

	private void helpP1()
	{
		move.setMove();
		if(board.isOccupied(move.getMove()))
		{
			System.out.println("Invalid move p1!");
			board.printBoard();
			helpP1();
		}
		else
		{
			board.setCell(p1.getPlayer(), move.getMove());
		}
	}
	
	private void helpP2()
	{
		move.setMove();
		if(board.isOccupied(move.getMove()))
		{
			System.out.println("Invalid move p2!");
			board.printBoard();
			helpP2();
		}
		else
		{
			board.setCell(p2.getPlayer(), move.getMove());
		}
	}

	public static void main(String[] args) 
	{
		boolean winner = false;
		ticTacToe game = new ticTacToe();
		
		game.board.printBoard();

		do
		{
			game.helpP1();
			if(game.result.isWinner(game.p1.getPlayer(), game.board.getBoard()))
			{
				winner = true;
				break;
			}
			game.board.printBoard();
			
			game.helpP2();
			if(game.result.isWinner(game.p2.getPlayer(), game.board.getBoard()))
			{
				winner = true;
				break;
			}
			game.board.printBoard();
		}
		while(winner == false);
		
		game.board.printBoard();
		
		if(winner == false)
		{
			System.out.println("It's a draw!");
		}
		else
		{
			System.out.println("Congratulation " + game.result.getWinner() + " you won!");
		}		
	}
}
