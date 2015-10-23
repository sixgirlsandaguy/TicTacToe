package ru.sixgirlsandaguy.ticTacToe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WorldTest {

	@Test
	public void greetResultsInHello() {
		World world = new World();
		assertEquals("Helloo", world.greet());
	}

}
