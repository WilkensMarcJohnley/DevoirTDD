package ilu2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	private static String text="Hello, my friend";
	private static String textBob="Hello, Bob";
	
	private static String textEx3= "HELLO, JERRY !";
	private static String textEx3_1 = "Hello, JeRRY";
	private static String textEx3_2= "Hello, JERRY";
	
	private static String textEx4= "Hello, Amy and Bob";
	private static String textEx4_1= "Hello, Wil and John";
	
	private static String textEx5= "Hello, Amy, Bob and Jerry";
	private static String textEx5_1= "Hello, Wil, John and Marc";
	
	private static String textEx6= "Hello, Amy and Jerry. AND HELLO, BOB !";
	private static String textEx6_1= "Hello, Wil and John. AND HELLO, MARC !";
	
	private static String textEx7= "Hello, Bob, Amy and Jerry";
	private static String textEx7_1= "Hello, Bob and Jerry. AND HELLO, AMY AND JACK !";
	private static String textEx7_2= "HELLO, WIL AND JOHN !";
	private static String textEx7_3="HELLO, MARC, WIL AND JOHN !";
	// ce test couvre le cas : jERRY (Tout en majuscule sauf une lettre)
	private static String textEx7_4="Hello, Wil and JERRY. AND HELLO, MARC AND JOHN !";
	
	private static String textEx8="Hello, Messi and Ronaldo";
	private static String textEx8_2="Hello, Bob and Jerry. AND HELLO, AMY AND JACK !";
	private static String textEx8_3="Hello, 1wil and John";
	private static String textEx8_4="Hello, 1wil and John. AND HELLO, MARC2 AND 3VIDO !";
	private static String textEx8_5="Hello, 1wil and 10john. AND HELLO, MARC2 AND 3VIDO !";
	//si la chaine de caractere ne contient que des chiffres, elle est considere comme un nom majuscule
	private static String textEx8_6="HELLO, 123 AND 122 !";
	
	private static String textEx9="Hello, Bob (x3) and Amy. AND HELLO, JERRY (x2) !";
	private static String textEx9_1= "Hello, Bob (x3)";
	private static String textEx9_2= "Hello, Bob (x3). AND HELLO, JOHN (x2) AND WIL !";
	private static String textEx9_3="HELLO, JOHN (x3) AND WIL !";

	private static String textEx10= "Bob, Yoda and Amy, Hello. AND HELLO, JERRY !";
	private static String textEx10_1= "Hello, Bob and Amy. AND YODA (x2) AND JERRY, HELLO !";
	private static String textEx10_2= "Bob, Yoda (x3) and Wil, Hello. AND YODA, MARC AND JOHN (x2), HELLO !";
	private static String textEx10_3= "Yoda (x3), Hello. AND YODA (x2), HELLO !";
	private static String textEx10_4="Messi, Ronaldo and Yoda (x4), Hello. AND XAVI, YES AND YODA, HELLO !";
	
	@Test
	void testconstructeur() {
		Welcome bien= new Welcome();
		assertTrue(bien!=null);
	}
	
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
	
	@Test
	void testEx5() {
		assertEquals(textEx5,Welcome.welcome("amy,bob,jerry"));
		assertEquals(textEx5_1,Welcome.welcome("wil,john,marc"));
	}
	
	@Test
	void testEx6() {
		assertEquals(textEx6,Welcome.welcome("amy,BOB,jerry"));
		assertEquals(textEx6_1,Welcome.welcome("wil,john,MARC"));
	}
	
	@Test
	void testEx7() {
		assertEquals(textEx7,Welcome.welcome("bob,amy,jerry"));
		assertEquals(textEx7_1,Welcome.welcome("bob,AMY,jerry,JACK"));
		assertEquals(textEx7_2,Welcome.welcome("WIL,JOHN"));
		assertEquals(textEx7_3,Welcome.welcome("MARC,WIL,JOHN"));
		assertEquals(textEx7_4,Welcome.welcome("wil,MARC,jERRY,JOHN"));
	}
	
	@Test
	void testEx8() {
		assertEquals(textEx4,Welcome.welcome("  amy  ,bob  "));
		assertEquals(textEx8,Welcome.welcome("  messi  ,Ronaldo  "));
		assertEquals(textEx7_1,Welcome.welcome("bob , AMY , jerry, JACK "));
		assertEquals(textEx7_2,Welcome.welcome("WIL , JOHN "));
		assertEquals(textEx7_3,Welcome.welcome(" MARC, WIL ,JOHN "));
		assertEquals(textEx8_3,Welcome.welcome(" 1wil, john "));
		assertEquals(textEx8_4,Welcome.welcome(" 1wil, MARC2, 3VIDO, john "));
		assertEquals(textEx8_5,Welcome.welcome(" 1wil, MARC2, 3VIDO, 10john "));
		//si la chaine de caractere ne contient que des chiffres, elle est considere comme un nom majuscule
		assertEquals(textEx8_6,Welcome.welcome(" 123,122 "));
	}

	@Test
	void testEx9() {
		assertEquals(textEx9,Welcome.welcome("bob, JERRY, amy, bob, JERRY, bob"));
		assertEquals(textEx9_1,Welcome.welcome("bob, bob,bob"));
		assertEquals(textEx9_2,Welcome.welcome("bob, Bob,JOHN, bob,JOHN, WIL"));
		assertEquals(textEx9_3,Welcome.welcome("JOHN, JOHN, WIL, JOHN"));
	}
	
	@Test
	void testEx10() {
		assertEquals(textEx10,Welcome.welcome("bob ,yoda ,amy,JERRY"));
		assertEquals(textEx10_1,Welcome.welcome("bob,YODA,amy,JERRY,YODA"));
		assertEquals(textEx10_2,Welcome.welcome("bob , yoda, wil, Yoda,YODA,MARC, yoda, JOHN ,JOHN"));
		assertEquals(textEx10_3,Welcome.welcome(" yoda,YODA , Yoda,yoda , YODA "));
		assertEquals(textEx10_4,Welcome.welcome(" messi,ronaldo, yoda,XAVI ,Yoda , yoda, YES,yoda,YODA "));
	}
}
