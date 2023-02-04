// java program parcentage

import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 6 subjects: ");
        float[] marks = new float[6];
        float sum = 0;
        for (int i = 0; i < 6; i++) {
            marks[i] = sc.nextFloat();
            sum += marks[i];
        }

        float percentage = sum / 6;
        System.out.println("Percentage: " + percentage + "%");
    }
}

