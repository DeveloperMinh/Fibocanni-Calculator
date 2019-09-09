package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MemoizedRecursiveFibonacciTest extends FibonacciTest{
  @Override
  protected Fibonacci createFibonacci() {
    return new MemoizedRecursiveFibonacci();
  }

  @Test
  void MemoizedMagnitudeDifferentFromRecursion(){
    assertTrue(getFibonacciTime(new SimpleRecursiveFibonacci()) >
      getFibonacciTime(new MemoizedRecursiveFibonacci()) * 10);
  }

  private long getFibonacciTime(Fibonacci aFibonacci) {
    long startTime = System.nanoTime();
    aFibonacci.fibonacci(40);
    return System.nanoTime() - startTime;
  }
}