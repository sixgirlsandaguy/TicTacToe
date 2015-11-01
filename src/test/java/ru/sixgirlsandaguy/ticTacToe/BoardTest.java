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

	@Test
	public void testisNotFull() 
	{
		Board b = new Board();

		b.setCell('X', 9);

		boolean occupied = false;

		assertEquals(occupied, b.isFull());
	}

	@Test
	public void testisFull() 
	{
		Board b = new Board();
		b.setCell('X', 1);
		b.setCell('O', 2);
		b.setCell('O', 3);
		b.setCell('X', 4);
		b.setCell('O', 5);
		b.setCell('X', 6);
		b.setCell('X', 7);
		b.setCell('O', 8);
		b.setCell('X', 9);

		boolean occupied = true;

		assertEquals(occupied, b.isFull());
	}

	@Test 
	public void testGetEmptyBoard()
	{
		Board b = new Board();
		char[][] test = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		assertEquals(test, b.getBoard());
	}

	public void testGetBoard()
	{
		Board b = new Board();
		b.setCell('0', 3);
		b.setCell('X', 5);
		b.setCell('X', 8);
		char[][] test = {{'1','2','O'},{'4','X','6'},{'7','X','9'}};
		assertEquals(test, b.getBoard());
	}


}




