package fibonacci;
import java.math.BigInteger;

public class ImperativeFibonacci implements Fibonacci {
  @Override
  public BigInteger fibonacci(int n) {
    BigInteger nextFibonacci = BigInteger.ONE,
      currentFibonacci = BigInteger.ONE;

    for (int i = 2; i <= n; i++) {
      nextFibonacci = currentFibonacci.add(nextFibonacci);
      currentFibonacci = nextFibonacci.subtract(currentFibonacci);
    }

    return nextFibonacci;
  }
}
