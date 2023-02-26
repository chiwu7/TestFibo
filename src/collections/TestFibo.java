package collections;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class TestFibo {

	@Test
	void testFibonacciIterator1() {
	    Fibonacci fibonacci = new Fibonacci(5);
	    Iterator<Integer> iterator = fibonacci.iterator();
	    assertTrue(iterator.hasNext());
	    assertEquals(1, iterator.next());
	}
	
	@Test
	void testFibonacciIterator2() {
	    Fibonacci fibonacci = new Fibonacci(5);
	    Iterator<Integer> iterator = fibonacci.iterator();
	    assertTrue(iterator.hasNext());
	    iterator.next();
	    assertTrue(iterator.hasNext());
	    assertEquals(1, iterator.next());
	}
	
	@Test
	void testFibonacciIterator4() {
	    Fibonacci fibonacci = new Fibonacci(5);
	    Iterator<Integer> iterator = fibonacci.iterator();
	    assertTrue(iterator.hasNext());
	    iterator.next();
	    iterator.next();
	    iterator.next();
	    assertTrue(iterator.hasNext());
	    assertEquals(3, iterator.next());
	}
	
	@Test
	void testFibonacciIteratorLimite() {
	    Fibonacci fibonacci = new Fibonacci(5);
	    Iterator<Integer> iterator = fibonacci.iterator();
	    assertTrue(iterator.hasNext());
	    iterator.next();
	    iterator.next();
	    iterator.next();
	    iterator.next();
	    iterator.next();
	    assertFalse(iterator.hasNext());
	}




}
