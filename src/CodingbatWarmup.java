import java.util.Arrays;

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

  public boolean startHi(String str) {
    return str.startsWith("hi");
  }

  public boolean icyHot(int temp1, int temp2) {
    return temp1 < 0 ? temp2 > 100 : temp1 > 100 && temp2 < 0;
  }

  public boolean in1020(int a, int b) {
    return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
  }

  public boolean hasTeen(int a, int b, int c) {
    int found = 0;
    int []teen = {a, b, c};
    for (int i: teen) {
      if ( i > 12 && i < 20) {
        found++;
      }
    }
    return found > 0;
  }

  public boolean loneTeen(int a, int b) {
    int found = 0;
    int []teen = {a, b};
    for (int i: teen) {
      if ( i > 12 && i < 20) {
        found++;
      }
    }
    return found == 1;
  }

  public String delDel(String str) {
    if( str.length() > 3 && str.charAt(1) == 'd' && str.charAt(2) == 'e'&& str.charAt(3) == 'l' )
      return str.substring(0,1) + str.substring(4,str.length());
    else return str;
  }

  public boolean mixStart(String str) {
    return str.length() > 2 && str.substring(1,3).equals("ix");
  }

  public String startOz(String str) {
    String oz = "";
    if (str.length() >= 1 && str.charAt(0) == 'o') {
      oz += "o";
    }
    if (str.length() >= 2 && str.charAt(1) == 'z') {
      oz += "z";
    }
    return oz;
  }

  public int intMax(int a, int b, int c) {
    int []max = {a, b, c};
    Arrays.sort(max);
    return max[max.length-1];
  }

  public int close10(int a, int b) {
    if (Math.abs((a - 10)) == Math.abs((b-10))) {
      return 0;
    } else
      return Math.abs((a - 10)) < Math.abs((b-10)) ? a : b;
  }

  public boolean in3050(int a, int b) {
    int min = 0;
    int max = 0;
    int [] data = {a, b};
    Arrays.sort(data);
    for (int i : data) {
      if (i >= 30 && i <= 40) {
        min++;
      }
      if (i >= 40 && i <= 50) {
        max++;
      }
    }
    return min == 2 | max == 2;
  }



}
