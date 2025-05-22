import java.util.Scanner;

/*
 * (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
 * For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
 * and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome. 
 * If the number is not five digits long, display an error message and allow the user to enter
 * a new value.
 */

public class IsPalindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number;

    do {
      System.out.print("Enter a five-digit integer: ");
      number = scanner.nextInt();

      if (number < 10000 || number > 99999) {
        System.out.println("Error: The number must be five digits long.");
      }
    } while (number < 10000 || number > 99999);

    int firstDigit = (int) number / 10000;
    int secondDigit = (number / 1000) % 10;
    int fourthDigit = (number / 10) % 10;
    int fifthDigit = number % 10;

    if (firstDigit == fifthDigit && secondDigit == fourthDigit) {
      System.out.println(number + " is a palindrome.");
    } else {
      System.out.println(number + " is not a palindrome.");
    }

    scanner.close();
  }
}
