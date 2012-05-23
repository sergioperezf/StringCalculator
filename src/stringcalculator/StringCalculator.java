package stringcalculator;

public class StringCalculator {

  public static void main(String[] args) {
    try {
      System.out.println(Add("//ss\n1ss3ss5"));
      System.out.println(Add("1"));
      System.out.println(Add(""));
      System.out.println(Add("3;1;5;3"));
      System.out.println(Add("3;1\n5;3"));
      System.out.println(Add("3;1\n;5;3"));
      System.out.println(Add("//oo\n-7oo1\n-5oo3"));
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }

  public static int Add(String numbers) throws Exception {
    if (numbers.equals("")) {
      return 0;
    }
    String[] allNumbers = numbers.split("\n");
    if (allNumbers.length == 0) {
      return 0;
    }
    String delimiter;
    String fNumbers;
    int sum = 0;
    if (allNumbers[0].matches("^//.+$")) {
      delimiter = allNumbers[0].substring(2, allNumbers[0].length());
      fNumbers = numbers.substring(allNumbers[0].length() + 1, numbers.length());
    } else {
      delimiter = ";";
      fNumbers = numbers;
    }
    if (fNumbers.indexOf("\n" + delimiter) != -1 || fNumbers.indexOf(delimiter + "\n") != -1) {
      return 0;
    }
    String[] finalNumbers = fNumbers.split("\n");
    boolean negative = false;
    String negatives = "";
    for (String Number : finalNumbers) {
      String[] FinalN = Number.split(delimiter);
      for (String Num : FinalN) {
        if (Num.matches("^-?\\d$")) {
          int S = Integer.parseInt(Num);
          if (S < 0) {
            negatives += S + ", ";
            negative = true;
            continue;
          }
          sum = sum + S;
        }
      }
    }
    if (negative) {
      throw new Exception("Negatives not allowed: " + negatives.substring(0, negatives.length() - 2));
    }
    return sum;
  }
}
