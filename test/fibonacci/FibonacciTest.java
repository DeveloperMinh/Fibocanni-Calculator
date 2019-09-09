package fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class FibonacciTest {
  private Fibonacci fibonacci;

  protected abstract Fibonacci createFibonacci();

  @BeforeEach
  void init() {
    fibonacci = createFibonacci();
  }

  @Test
  void canary() {
    assertTrue(true);
  }

  @Test
  void nIsZero() {
    assertEquals(BigInteger.ONE, fibonacci.fibonacci(0));
  }

  @Test
  void nIsOne() {
    assertEquals(BigInteger.ONE, fibonacci.fibonacci(1));
  }

  @Test
  void nIsTwo() {
    assertEquals(BigInteger.TWO, fibonacci.fibonacci(2));
  }

  @Test
  void nIsFive() {
    assertEquals(new BigInteger("8"), fibonacci.fibonacci(5));
  }

  @Test
  void nIsSix() {
    assertEquals(new BigInteger("13"), fibonacci.fibonacci(6));
  }

  @Test
  void nIsTen() {
    assertEquals(new BigInteger("89"), fibonacci.fibonacci(10));
  }
}