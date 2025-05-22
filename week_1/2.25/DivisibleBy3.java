import java.util.Scanner;
/*
 * 
 * (Divisible by 3) Write an application that reads an integer and determines and prints
 * whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
 * it’s divided by 3 with a remainder of 0.]
 */

public class DivisibleBy3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    input.close();

    if (number != 0 && number % 3 == 0) {
      System.out.printf("%d is divisible by 3\n", number);
    } else {
      System.out.printf("%d is not divisible by 3\n", number);
    }
  }
}
