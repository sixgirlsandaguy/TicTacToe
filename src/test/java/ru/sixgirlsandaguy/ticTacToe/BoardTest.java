package ru.sixgirlsandaguy.ticTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class BoardTest {

	public static void main(String args[]) 
	{
      org.junit.runner.JUnitCore.main("ru.sixgirlsandaguy.ticTacToe");
    }

	@Test
	public void testGetCell() 
	{
		Board b = new Board();
		assertEquals('1', b.getCell(1));
	}
}