public class CodingbatWarmup {

  public boolean sleepIn(boolean weekday, boolean vacation) {
    return !weekday | vacation;
  }

  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return aSmile == bSmile;
  }

  public int sumDouble(int a, int b) {
    int sum = a + b;
    return a == b ? sum * 2 : sum;
  }

  public int diff21(int n) {
    return n < 21 ? 21 - n : (n - 21) * 2;
  }

  public boolean parrotTrouble(boolean talking, int hour) {
    return talking && hour < 7 | hour > 20;
  }

}
