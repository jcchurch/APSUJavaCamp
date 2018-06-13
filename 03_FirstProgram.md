% 03: Our first Java Program

# Important Terms

## Import Things to Know about Java

- Java is an **Object-Oriented Programming** Language.
- An **object** is a block of memory that contains variables and methods.
    - A **method** is an action that an object is allowed to perform.
    - If an object doesn't have a method, then it can't do that action.
- A **class** defines the variables and methods for **objects**.

## Import Things to Know about Java

- Every Java program contains at least one class.
- There is exactly one a class containing a **method** called **main**.
- The **main** method is the start of the program.
    - If you aren't sure where a program begins, look for **main**.
- The name of the **class** containing **main** must be spelled identical to the name of the file. This includes capitalization.
- The extension for this file must always be ".java".

# Hello Java!

## Start Up NetBeans

1. Click the button in NetBeans for a new project.
    - It looks like a brown box with a green plus sign. You'll find it in the menu bar.
2. Make sure that you select "Java" under "Categories".
3. Make sure that you create a "Java Application" under "Projects". Click "Next".
4. Name your project "HelloJava".
    - Make sure that you spell it identical to how it appears in quotes.
    - "H" and "J" are capitalized.
    - There is no space between "Hello" and "Java".
5. Click "Finish".

Raise your hand if you have trouble with any of these steps.

## Begin Programming:

Look for this line:

    public static void main(String[] args) {

Raise your hand if you have trouble finding this line.

## Remove a line of code.

Under the line of code that contains **main**, look for the next line.

    public static void main(String[] args) {
        // TODO code application logic here

- Keep the line that contains **main**. Delete the entire line of code that begins with "// TODO ..."
- Make sure that you keep all of the "}"'s after the line containing TODO.

## Your code should look like this.

    public static void main(String[] args) {

    }

If your code looks like this, click the green arrow on the menu button. This is the "Play" button.

## Program Output

This is **main** method is empty. The entire program does nothing. When you click "Play", you should see this:

    run:
    BUILD SUCCESSFUL (total time: 0 seconds)

If you do not see "BUILD SUCCESSFUL", please raise your hand.

## Add an output line

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

Write the line between the two curly brackets. The two curly brackets represent the beginning and end of **main**. Don't forget to put a semicolon at the end of your line. Run your program with the green arrow button.

## After running.

You should see this. Now you are programming in Java!

    run:
    Hello, world!
    BUILD SUCCESSFUL (total time: 0 seconds)

If you don't see your message, please raise your hand.

## Add more output lines

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("My name is [YOUR NAME]");
        System.out.println("My favorite movie is [MOVIE]");
        System.out.println("My favorite song is [SONG]");
    }

Run your program again. Java will execute lines in order from first line in **main** to the last line.


