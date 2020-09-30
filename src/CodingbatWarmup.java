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

  public String frontBack(String str) {
    if (str.length() <= 1) {
      return str;
    }
    String core = str.substring(1, str.length()-1);
    return str.charAt(str.length()-1) + core + str.charAt(0);
  }

  public String front3(String str) {
    if (str.length() < 3) {
      return str+str+str;
    }
    String front = str.substring(0,3);
    return front + front + front;
  }

  public String backAround(String str) {
    char rear = str.charAt(str.length() - 1);
    return rear + str + rear;
  }

  public boolean or35(int n) {
    return ( n % 3 == 0) || (n % 5 == 0);
  }

  public String front22(String str) {
    String front;
    if (str.length() < 2) {
      front = str;
    } else {
      front = str.substring(0, 2);
    }
    return front + str + front;
  }

}
