import java.util.*;

public class lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        int count = 0;
        for (String word : text.split("\\s+")) {
            if (Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }

        System.out.println("Number capital letter: " + count);
    }
}
