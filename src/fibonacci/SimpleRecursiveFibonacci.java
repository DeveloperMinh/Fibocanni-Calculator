package fibonacci;

import java.math.BigInteger;

public class SimpleRecursiveFibonacci implements Fibonacci {
  @Override
  public BigInteger fibonacci(int n) {
    if(n < 2) {
      return BigInteger.ONE;             
    }

    return fibonacci(n - 2).add(fibonacci(n - 1));
  }
}
