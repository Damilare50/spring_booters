import java.util.Scanner;
/*
 * 
 * (Multiples) Write an application that reads two integers, determines whether the first
 * number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
 * remainder operator.]
 */

public class Multiple {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int first = input.nextInt();
    System.out.print("Enter second integer: ");
    int second = input.nextInt();

    input.close();

    if ((first * 3) % (second * 2) == 0) {
      System.out.printf("%d*3 is a multiple of %d*2\n", first, second);
    } else {
      System.out.printf("%d*3 is not a multiple of %d*2\n", first, second);
    }
  }
}
