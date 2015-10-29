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

	@Test 
	public void testSetCell()
	{
		Board b = new Board();
		b.setCell('X', 6);
		assertEquals('X', b.getCell(6));
	}

	@Test 
	public void testSetCellForO()
	{
		Board b = new Board();
		b.setCell('O', 6);
		assertEquals('O', b.getCell(6));
	}

	@Test
	public void testisNotOccupied() 
	{
		Board b = new Board();

		boolean occupied = false;

		assertEquals(occupied, b.isOccupied(4));
	}

	@Test
	public void testisOccupied() 
	{
		Board b = new Board();

		b.setCell('X', 5);

		boolean occupied = true;

		assertEquals(occupied, b.isOccupied(5));
	}


}




