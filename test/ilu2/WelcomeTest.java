package ilu2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	private static final String textEx3_1 = "Hello, JeRRY";
	private static String text="Hello, my friend";
	private static String textBob="Hello, Bob";
	private static String textEx3= "HELLO, JERRY !";
	private static String textEx3_2= "Hello, JERRY";
	
	
	
	@Test
	void testEx1() {
		assertEquals(textBob, Welcome.welcome("bob"));
		assertEquals(textBob, Welcome.welcome("Bob"));
	}
	
	@Test
	void testEx2() {
		assertEquals(text, Welcome.welcome("    "));
		assertEquals(text, Welcome.welcome(""));
		assertEquals(text, Welcome.welcome(" "));
		assertEquals(text, Welcome.welcome(null));
	}
	
	@Test
	void testEx3() {
		assertEquals(textEx3, Welcome.welcome("JERRY"));
		assertEquals(textEx3_1, Welcome.welcome("JeRRY"));
		assertEquals(textEx3_2, Welcome.welcome("jERRY"));
		
	}

}
