package ru.sixgirlsandaguy.ticTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest
{
	public static void main(String args[])
	{
      		org.junit.runner.JUnitCore.main("");
    	}

    	//Tests both get and set, its impossible to test these
    	//two functions seperatly
	@Test
	public void testGetAndSetPlayer()
	{
		Player p = new Player();
		p.setPlayer('X');
		assertEquals('X', p.getPlayer());
	}
}
