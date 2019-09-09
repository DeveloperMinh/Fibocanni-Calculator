package fibonacci;

class FunctionalFibonacciTest extends FibonacciTest {
  @Override
  protected Fibonacci createFibonacci() {
    return new FunctionalFibonacci();
  }
}
