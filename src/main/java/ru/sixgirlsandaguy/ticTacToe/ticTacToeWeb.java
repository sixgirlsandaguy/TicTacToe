done.package ru.sixgirlsandaguy.ticTacToe;

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

	@Override
	public void init()
	{

		if (game == null)
		{
			game = new ticTacToe();
		}
      	
		post(new Route("/cell"){
			@Override
			public Object handle(Request request, Response response){
			    
			    
			    int pos = Integer.valueOf(request.queryParams("cell"));
			    char currPlayer = game.playerTurn();
			    game.play(pos);
			    return currPlayer;
			
			}	
		    });
		post(new Route("/newgame"){
			@Override
			public Object handle(Request request, Response response){
			    
			    game = new ticTacToe();
			    return true;
			}
		    });
		
		post(new Route("/isgameover"){
			@Override
			public Object handle(Request request, Response response){
			    
	     			    return game.winner();
			}
			
		    });
	}
}
