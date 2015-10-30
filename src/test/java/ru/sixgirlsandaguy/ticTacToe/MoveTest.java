package ru.sixgirlsandaguy.ticTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoveTest
{
	@Test
	public void stringToCharDigit() 
	{
		Move m = new Move();
		assertEquals('5' , m.stringToChar("5"));
	}

	@Test
	public void stringToCharChar() 
	{
		Move m = new Move();
		assertEquals('b' , m.stringToChar("b"));
	}
}
