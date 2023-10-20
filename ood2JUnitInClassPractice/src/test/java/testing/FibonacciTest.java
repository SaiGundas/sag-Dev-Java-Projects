package testing;

import org.junit.Test;

public class FibonacciTest {
	
	@Test
	public void testFibonacciofOne() {
		//Arrange
		Fibonacci fibo = new Fibonacci(); //(Creating an object in the class)
		//Act
		int result = Fibonacci.fib(1);
		//Assert
		assert(result ==0);
	}
	@Test
	public void testFibonacciofTwo() {
		assert(Fibonacci.fib(2)==1);
	}
	@Test
	public void testFibonacciofThree() {
		assert(Fibonacci.fib(3)==1);
	}
	@Test
	public void testFibonacciofFour() {
		assert(Fibonacci.fib(4)==2);
	}
	@Test
	public void testFibonacciofFive() {
		assert(Fibonacci.fib(5)==3);
	}
	@Test
	public void testFibonacciofSix() {
		assert(Fibonacci.fib(6)==5);
	}

}
