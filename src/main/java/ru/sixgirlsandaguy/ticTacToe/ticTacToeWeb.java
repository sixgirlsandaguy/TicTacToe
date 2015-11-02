package ru.sixgirlsandaguy.ticTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class ticTacToeWeb implements SparkApplication
{
	//buaa til constructor?
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

	//@Override
	public void init()
	{

		if (game == null)
		{
			game = new ticTacToe();
		}

		post(new Route("/cell")
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
      	
		/*post("/cell", (request, response) -> {		    
			    
			    int pos = Integer.valueOf(request.queryParams("cell"));
			    char currPlayer = game.playerTurn();
			    game.play(pos);
			    return currPlayer;
			
		    });*/
		

		post(new Route("/newgame")
		{
			@Override
			public Object handle(final Request request, final Response response)
			{
				game = new ticTacToe();
				return true;
			}	
		});
		
		/*
		post("/newgame", (request,response)->{    
			    game = new ticTacToe();
			    return true;
			
		    });
		*/

		post(new Route("/isgameover")
		{
			@Override
			public Object handle(final wqRequest request, final Response response)
			{
				return game.winner();
			}
		});
		/*
		post("/isgameover", (request,response)->{   
	     			    return game.winner();
			
			
		    });*/
	}
}
