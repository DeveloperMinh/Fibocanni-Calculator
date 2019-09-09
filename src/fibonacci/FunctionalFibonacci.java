package fibonacci;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Stream;

public class FunctionalFibonacci implements Fibonacci {
  @Override
  public BigInteger fibonacci(int n) {
    if(n < 2) {
      return BigInteger.ONE;
    }

    return Stream.iterate(List.of(BigInteger.ONE, BigInteger.ONE), current ->
        List.of(current.get(1), current.get(0).add(current.get(1))))
      .limit(n + 1)
      .skip(n)
      .findFirst()
      .orElseThrow()
      .get(0);
  }
}
