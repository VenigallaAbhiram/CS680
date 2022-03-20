package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {

	@Test
	 public void primes() {
	       PrimeGenerator primeGenerator = new PrimeGenerator(1, 15);
	       primeGenerator.generatePrimes();
	       Long[] expectedprimes = { 2L, 3L, 5L, 7L,11L, 13L };
	       assertArrayEquals(expectedprimes, primeGenerator.getPrimes().toArray());
	 }


	 @Test
	 public void PrimesFound() {
	       PrimeGenerator primeGenerator = new PrimeGenerator(1, 15);
	       primeGenerator.generatePrimes();
	       assertEquals(primeGenerator.getPrimes().size(), 6);
	 }
	 
	 @Test
	 public void EvenPrimesFound() {
	       PrimeGenerator primeGenerator = new PrimeGenerator(1,2);
	       primeGenerator.generatePrimes();
	       assertEquals(primeGenerator.getPrimes().size(), 1);
	 }

	 
	 @Test
	    public void WrongInputRange() {
	        try {
	            PrimeGenerator primeGenerator = new PrimeGenerator(-1, -15);
	            primeGenerator.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=-1 to=-15", ex.getMessage());
	        }
	    }

}
