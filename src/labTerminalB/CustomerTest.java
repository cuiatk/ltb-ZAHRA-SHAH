package labTerminalB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {
	Movie m1 = new Movie("Spancer", 0);
	Movie m2 = new Movie("Speed", 1);
	Movie m3 = new Movie("back", 2);
	Movie m4 = new Movie("xyz", 3);
	Customer me = new Customer("Nadir");
	Customer me2 = new Customer("Allah Ditta");
	Customer me3 = new Customer("Nusrat");
	
	Rental r1 = new Rental(m1, 23);
	Rental r2 = new Rental(m2,4);
	Rental r3 = new Rental(m3, 20);
	Rental r4 = new Rental(m4,8);
	
	
	/**
	 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
	 */
	@Test
	public void testStatement1() {
		me.addRental(r1);
		me.addRental(r2);
		//fail("Not yet implemented");
		String output1 = "Rental Record for Nadir\r\n" + 
				"	Spancer	33.5\r\n" + 
				"	Speed	12.0";
		if(output1.equals(me.statement()))
		{
			assert true;
		}
	}
	/*
	 * TODO 2			10 Marks
	 * Provide at least two more test cases carefully chosen so that they satisfy our testing
	 * strategy basics i.e. input partition etc
	 */
	
	/**
	 * Test 1 Customer rent new movies 
	 */
	@Test
	public void newmovierental() {
		me.addRental(new Rental(m2,1));
		assertEquals(me.statement(),me.statement());
	}
	
	@Test
	public void testStatement2() {
		me3.addRental(r4);
		me3.addRental(r3);
		//fail("Not yet implemented");
		String output1 = "Rental Record for Nusrat\r\n" + 
				"	Spancer	40.5\r\n" + 
				"	Speed	8.0";
		if(output1.equals(me3.statement()))
		{
			assert true;
		}
	}

}
