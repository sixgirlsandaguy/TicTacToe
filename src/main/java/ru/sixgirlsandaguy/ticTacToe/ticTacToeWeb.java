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
			port(Integer.valueOf(port));
		}

		//ticTacToe.init();
	}

	//@Override
	public void init()
	{
		if (game == null)
		{
			game = new ticTacToe();
		}
	}
}