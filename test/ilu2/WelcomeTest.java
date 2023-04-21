package ilu2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void testEx1() {
		assertEquals("Hello, Bob", Welcome.welcome("bob"));
		assertEquals("Hello, Bob", Welcome.welcome("Bob"));
	}
	
	@Test
	void testEx2() {
		assertEquals("Hello, my friend", Welcome.welcome("    "));
		assertEquals("Hello, my friend", Welcome.welcome(""));
		assertEquals("Hello, my friend", Welcome.welcome(" "));
		assertEquals("Hello, my friend", Welcome.welcome(null));
	}

}
