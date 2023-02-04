// java program sum x and y

import java.util.*;
public class lab2 {
    public static void main(String[] args){
        float x,y;
        Scanner sc = new Scanner(System.in);
        float a =sc.nextFloat();
        float b =sc.nextFloat();
        float c =sc.nextFloat();
        float d =sc.nextFloat();
        float e =sc.nextFloat();
        float f =sc.nextFloat();
        x= ((e*d)-(b*f))/((a*d)-(b*c));
        y= ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("value of x:" +x);
        System.out.println("value of y:" +y);
    }
}
