import java.util.Scanner;

/*
 * 
 * (Largest and Smallest Integers) Write an application that reads five integers and determines
 * and prints the largest and smallest integers in the group. Use only the programming techniques you
 * learned in this chapter.
 */

class MaxMin {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter five integers: ");
    int no1 = input.nextInt();
    int no2 = input.nextInt();
    int no3 = input.nextInt();
    int no4 = input.nextInt();
    int no5 = input.nextInt();

    input.close();

    int max = no1;
    int min = no1;

    if (no2 > max) {
      max = no2;
    }
    if (no2 < min) {
      min = no2;
    }
    if (no3 > max) {
      max = no3;
    }
    if (no3 < min) {
      min = no3;
    }
    if (no4 > max) {
      max = no4;
    }
    if (no4 < min) {
      min = no4;
    }
    if (no5 > max) {
      max = no5;
    }
    if (no5 < min) {
      min = no5;
    }
    System.out.printf("The largest number is %d\n", max);
    System.out.printf("The smallest number is %d\n", min);
  }

}
