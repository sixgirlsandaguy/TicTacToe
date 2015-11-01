package ru.sixgirlsandaguy.ticTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ResultTest
{
	@Test
	public void testNoWinner()
	{
		Result r = new Result();
		char testArr[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		boolean b = false;
		assertEquals(b, r.isWinner('X', testArr));
	}

	@Test
	public void testNoWinner2()
	{
		Result r = new Result();
		char testArr[][] = {{'O','2','3'},{'4','X','6'},{'O','8','X'}};
		boolean b = false;
		assertEquals(b, r.isWinner('X', testArr));
	}

	@Test
	public void testWinnerVertical()
	{
		Result r = new Result();
		char testArr[][] = {{'X','2','3'},{'X','5','6'},{'X','8','9'}};
		boolean b = true;
		assertEquals(b, r.isWinner('X', testArr));
	}

	@Test
	public void testWinnerHorizontal()
	{
		Result r = new Result();
		char testArr[][] = {{'O','O','O'},{'4','5','6'},{'7','8','9'}};
		boolean b = true;
		assertEquals(b, r.isWinner('O', testArr));
	}

	@Test
	public void testWinner159() 
	{
		Result r = new Result();
		char testArr[][] = {{'X','2','3'},{'4','X','6'},{'7','8','X'}};
		boolean b = true;
		assertEquals(b, r.isWinner('X', testArr));
	}

	@Test
	public void testWinner357() 
	{
		Result r = new Result();
		char testArr[][] = {{'1','2','O'},{'4','O','6'},{'O','8','9'}};
		boolean b = true;
		assertEquals(b, r.isWinner('O', testArr));
	}
}

