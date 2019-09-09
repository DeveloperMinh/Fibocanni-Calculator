package fibonacci;

class ImperativeFibonacciTest extends FibonacciTest {
  @Override
  protected Fibonacci createFibonacci() {
    return new ImperativeFibonacci();
  }
}
