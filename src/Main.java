/*Try the following exercises:

- Write a Java program to create a new array list to hold colors.
- Add at least 3 colors (string) to the array list and print out all its values.
- Using the array list created above, print out the value at index 1.
- Using the array list above, prompt the user for one new color, and add that color to the array list.
- Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit.
  Each time the user enters a color, add that to the array list. Print out the list at the end.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList colors = new ArrayList<String>();
        String answer = "";

        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println(colors);
        System.out.println("Color at index 1 is " + colors.get(1));

        while (!answer.equalsIgnoreCase("q")){
            System.out.println("Enter a new color or \"q\" to quit: ");
            answer = kb.nextLine();

            if (!answer.equalsIgnoreCase("q"))
                colors.add(answer);
        }

        System.out.println(colors);
    }
}