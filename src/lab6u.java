// java program swaping number

import java.util.Scanner;

public class lab6u {
    public static void main(String[] args){
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        if(a<b){
            temp=a;
            a=b;
            b=temp;
        }
        System.out.println("enter the there number:");
        int c=sc.nextInt();
        if(c>b){
            if(c>a){
                temp=c;
                c=b;
                b=a;
                a=temp;
            }
            else{
                temp=c;
                c=b;
                b=temp;
            }
        }
        System.out.println("decreasing order =:" +a+" "+b+" "+c+"" );
    }
}
