import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertTrue(PrimeCheck.isPrime(3));
    assertTrue(PrimeCheck.isPrime(5));
    assertTrue(PrimeCheck.isPrime(7));
    assertTrue(PrimeCheck.isPrime(11));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertFalse(PrimeCheck.isPrime(4));
    assertFalse(PrimeCheck.isPrime(6));
    assertFalse(PrimeCheck.isPrime(21));
    assertFalse(PrimeCheck.isPrime(27));
  }
}
