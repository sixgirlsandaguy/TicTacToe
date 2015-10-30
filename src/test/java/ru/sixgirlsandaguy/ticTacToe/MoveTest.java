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

		@Test
	public void isValidString() 
	{
		Move m = new Move();
		assertEquals(false, m.isValid("Hannes"));
	}

	@Test
	public void isValidChar() 
	{
		Move m = new Move();
		assertEquals(false, m.isValid("d"));
	}

	@Test
	public void isValidMinus() 
	{
		Move m = new Move();
		assertEquals(false, m.isValid("-12"));
	}

	@Test
	public void isValidTrue() 
	{
		Move m = new Move();
		assertEquals(true, m.isValid("1"));
	}

	@Test
	public void isValidBiggerThanNine() 
	{
		Move m = new Move();
		assertEquals(false, m.isValid("10"));
	}
}
