package addfive;

import java.util.Scanner;

public class AddFive {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program reports your age in five years.");
        System.out.print("What is your age? ");

        int age = keyboard.nextInt();
        int agePlusFive = age + 5;
        System.out.println("In five years, you will be " +
            agePlusFive + " years old.");
    }
}
