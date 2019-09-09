package fibonacci;

public class SimpleRecursiveFibonacciTest extends FibonacciTest {
  @Override
  protected Fibonacci createFibonacci() {
    return new SimpleRecursiveFibonacci();
  }
}
