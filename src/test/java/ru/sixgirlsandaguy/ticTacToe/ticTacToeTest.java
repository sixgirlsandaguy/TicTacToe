package ru.sixgirlsandaguy.ticTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ticTacToeTest {
	
	public static void main(String args[]) 
	{
	      org.junit.runner.JUnitCore.main("ru.sixgirlsandaguy.ticTacToe");
    	}
	
	@Test
	public void testWinner() 
	{
		ticTacToe t = new ticTacToe();
		
		t.play(1);
		t.play(4);
		t.play(2);
		t.play(6); 
		t.play(9);
		t.play(5); 
		
		assertEquals('O',t.winner());
	}
}

