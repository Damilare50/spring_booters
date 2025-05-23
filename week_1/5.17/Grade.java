import java.util.Scanner;

/*
 * (Student Grades) A group of five students earned the following grades: Student 1, ‘A’;
 * student 2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’. Write an application that reads a series
 * of pairs of numbers as follows:
 *  a) student name
 *  b) student letter grade
 * Your program should use a switch statement to determine how many students got a grade of ‘A’,
 * how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
 * loop as needed to input the five student grades, and then finally display the results.
 */

public class Grade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] students = new String[5];
    char[] grades = new char[5];
    int aCount = 0, bCount = 0, cCount = 0, dCount = 0;

    for (int i = 0; i < students.length; i++) {
      System.out.print("Enter name for student " + (i + 1) + ": ");
      students[i] = scanner.nextLine();
      System.out.print("Enter grade for student " + (i + 1) + ": ");
      grades[i] = scanner.next().charAt(0);

      switch (grades[i]) {
        case 'A':
          aCount++;
          break;
        case 'B':
          bCount++;
          break;
        case 'C':
          cCount++;
          break;
        case 'D':
          dCount++;
          break;
        default:
          System.out.println("Invalid grade: " + grades[i]);
      }
      scanner.nextLine();
    }

    System.out.println("Number of students with grade A: " + aCount);
    System.out.println("Number of students with grade B: " + bCount);
    System.out.println("Number of students with grade C: " + cCount);
    System.out.println("Number of students with grade D: " + dCount);

    scanner.close();
  }
}
