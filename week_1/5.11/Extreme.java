import java.util.Scanner;
import java.util.random.RandomGenerator;

/*
 * (Extremes) Write an application that finds the minimum and maximum amongst several
 * integers and then computes the sum of the two extremes. The user will be prompted to input how
 * many values the application should ask the user to input.
 */

public class Extreme {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfValues;

    numberOfValues = RandomGenerator.getDefault().nextInt(2, 10);

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    System.out.println("You will be prompted to enter " + numberOfValues + " values.");

    for (int i = 1; i <= numberOfValues; i++) {
      System.out.print("Enter value " + i + ": ");
      int value = scanner.nextInt();

      if (value < min) {
        min = value;
      }
      if (value > max) {
        max = value;
      }
    }

    int sumOfExtremes = min + max;
    System.out.printf("%nMinimum: %d%n", min);
    System.out.println("Maximum: " + max);
    System.out.println("Sum of extremes: " + sumOfExtremes);

    scanner.close();
  }
}
