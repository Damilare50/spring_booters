import java.util.Scanner;

/*
 * Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you prefer, 
 * the user’s weight in kilograms and height in meters), then calculates and displays the user’s
 * body mass index. Also, display the BMI categories and their values from the National Heart Lung
 * and Blood Institute
 */

public class BMICalculator {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your weight in kilograms (kg): ");
    double weight = input.nextDouble();

    System.out.print("Enter your height in metres (m): ");
    double height = input.nextDouble();

    double bmi = weight / (height * height);

    input.close();

    System.out.printf("%nYour BMI is: %.2f%n%n", bmi);

    System.out.println("BMI Categories:");
    System.out.println("Underweight: less than 18.5");
    System.out.println("Normal weight: 18.5 – 24.9");
    System.out.println("Overweight: 25 – 29.9");
    System.out.println("Obesity: greater than 30");
  }
}
