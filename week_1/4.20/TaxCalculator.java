import java.util.Scanner;

/*
 * (Tax Calculator) Develop a Java application that determines the total tax for each of three
 * citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
 * earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
 * a given year. Your program should input this information for each citizen, then determine and dis-
 * play the citizen’s total tax. Use class Scanner to input the data.
 */

public class TaxCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] citizens = new String[3];
    double[] earnings = new double[3];
    double[] taxes = new double[3];

    int index = 0;
    while (index < 3) {
      System.out.print("Enter the name of citizen " + (index + 1) + ": ");
      citizens[index] = scanner.nextLine();

      System.out.print("Enter the earnings of " + citizens[index] + ": ");
      earnings[index] = scanner.nextDouble();
      scanner.nextLine();

      if (earnings[index] <= 30000) {
        taxes[index] = earnings[index] * 0.15;
      } else {
        taxes[index] = (30000 * 0.15) + ((earnings[index] - 30000) * 0.20);
      }

      index++;
    }

    System.out.println("\nTax Summary:");
    for (int i = 0; i < 3; i++) {
      System.out.println(citizens[i] + "'s total tax: " + taxes[i]);
    }

    scanner.close();
  }
}
