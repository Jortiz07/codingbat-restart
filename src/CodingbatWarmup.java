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

}
