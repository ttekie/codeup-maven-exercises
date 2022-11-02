import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scan.nextLine();
        System.out.println("You entered: " + userInput);
        if (StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is a number");
        } else {
            System.out.println("That is not a number");
        }

        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
        System.out.println("Reverse: " + StringUtils.reverse(userInput));
    }
}
