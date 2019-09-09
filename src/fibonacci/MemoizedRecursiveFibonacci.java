package fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class MemoizedRecursiveFibonacci implements Fibonacci {
  private Map<Integer, BigInteger> cache = new HashMap<>();

  public BigInteger fibonacci(int n) {
    if(!cache.containsKey(n)) {
      if(n < 2) {
        return BigInteger.ONE;
      }

      cache.put(n, fibonacci(n - 2).add(fibonacci(n - 1)));
    }

    return cache.get(n);
  }
}
