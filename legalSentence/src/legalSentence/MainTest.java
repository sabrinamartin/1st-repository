package legalSentence;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals(true, Main.legal("~P&Q&~P"));
		assertEquals(false, Main.legal("P&PQ"));
		assertEquals(true, Main.legal("~p|~p&q"));
	}
	
	@Test
	public void simpleSentenceTest() {
		assertEquals(false, Main.legal("hamburgers"));
		assertEquals("Empty string test", false, Main.legal(""));
		assertEquals(true, Main.legal("P"));
	}
	
	@Test
	public void notTest() {
		assertEquals(true, Main.legal("~~P"));
		
	}
	
	@Test
	public void orTest() {
		assertEquals(true, Main.legal("P|Q"));
		assertEquals(false, Main.legal("|P"));
		assertEquals(false, Main.legal("P|"));
	}


}
