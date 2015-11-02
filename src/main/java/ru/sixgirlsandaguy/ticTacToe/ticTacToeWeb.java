package ru.sixgirlsandaguy.ticTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class ticTacToeWeb implements SparkApplication
{
	private ticTacToe game;

	public static void main(String[] args)
	{
		staticFileLocation("/public");
		SparkApplication ticTacToe = new ticTacToeWeb();
		String port = System.getenv("PORT");
		if(port != null)
		{
		    setPort(Integer.valueOf(port));
		}

		ticTacToe.init();
	}

	public void init()
	{

		if (game == null)
		{
			game = new ticTacToe();
		}

		Spark.post("/cell", new Route()
		{
			@Override
			public Object handle(final Request request, final Response response)
			{
				int pos = Integer.valueOf(request.queryParams("cell"));
				char currPlayer = game.playerTurn();
				game.play(pos);
				return currPlayer;
			}
		});
		
		Spark.post("/newgame", new Route()
		{
			@Override
			public Object handle(final Request request, final Response response)
			{
				game = new ticTacToe();
				return true;
			}	 	
		});	

		Spark.post("/isgameover", new Route()
		{
			@Override	
			public Object handle(final Request request, final Response response)
			{	
				return game.winner();
			}
		});
	}
}
