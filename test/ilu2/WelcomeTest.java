package ilu2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	private static String text="Hello, my friend";
	private static String textBob="Hello, Bob";
	
	private static String textEx3= "HELLO, JERRY !";
	private static String textEx3_1 = "Hello, JeRRY";
	private static String textEx3_2= "Hello, JERRY";
	
	private static String textEx4= "Hello, Amy, Bob";
	private static String textEx4_1= "Hello, Wil, John";
	
	
	
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
	
	@Test
	void testEx4() {
		assertEquals(textEx4,Welcome.welcome("amy,bob"));
		assertEquals(textEx4_1,Welcome.welcome("wil,john"));
	}

}
