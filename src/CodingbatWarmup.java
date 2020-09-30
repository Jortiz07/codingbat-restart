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

  public boolean makes10(int a, int b) {
    return a == 10 || b == 10 || a + b == 10;
  }

  public boolean nearHundred(int n) {
    return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
  }

  public boolean posNeg(int a, int b, boolean negative) {
    if (negative) {
      return  a + b < Math.abs(a + b);
    } else return a < 0 && b > 0 || a > 0 && b < 0;
  }

  public String notString(String str) {
    String prefix = "not";
    if (str.startsWith(prefix)) {
      return str;
    } else {
      return prefix+" "+str;
    }
  }

  public String missingChar(String str, int n) {
    String front = str.substring(0, n);
    String rear = str.substring(n+1, str.length());
    return front + rear;
  }

}
