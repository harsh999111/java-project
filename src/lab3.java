// java program meter
import java.util.*;

public class lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value in Meters :");
        double meter = input.nextDouble();
        double feet = meter * 3;
        System.out.print(meter + " Meters = " + feet + " Feets");
    }
}
