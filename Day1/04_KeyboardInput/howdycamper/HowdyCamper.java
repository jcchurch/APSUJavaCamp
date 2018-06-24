package howdycamper;

import java.util.Scanner;

public class HowdyCamper {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Howdy, camper.");
        System.out.print("What is your name? ");

        String name = keyboard.nextLine();
        System.out.println("Hello, " + name +
            "! We are glad you could be here.");
    }
}
