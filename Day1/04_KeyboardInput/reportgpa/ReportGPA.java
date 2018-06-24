package reportgpa;

import java.util.Scanner;

public class ReportGPA {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Howdy, camper.");
        System.out.print("What is your gpa? ");

        double gpa = keyboard.nextDouble();
        System.out.println("Hello! You have a " +
            gpa + " grade point average.");
    }
}
