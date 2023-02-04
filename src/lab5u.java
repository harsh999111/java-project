// java program length

import java.util.*;

public class lab5u {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=new String();
        System.out.println("enter string:");
        s=sc.nextLine();
        int count=0;
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(c>=65 && c<=90){
                count++;
            }
        }
        System.out.println(count);
    }
}