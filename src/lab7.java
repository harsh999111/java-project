// java program decreasing order

import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers: ");

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("In decreasing order: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}
