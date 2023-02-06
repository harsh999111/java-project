import java.util.*;

public class lab8{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        char c;
        
        boolean label = true;
        while(label){
            label = false;
        
        System.out.println("enter character:");
        c=sc.next().charAt(0);
        if(c=='A' || c=='I' || c=='O' || c=='U' || c=='a' || c=='i' || c=='o' || c=='u' ){
            System.out.println("character is vowel.");
        }
        // else if(c>=0 && c<=9){
        //     System.out.println("this latter os not character");
        //     label=true;
        // }
        else if (c>=32 && c<=64 || c>=91 && c<96 || c<=123 && c>=127){
            System.out.println("this is latter as not character.");
            label=true;
        }
        else{
            System.out.println("character is Consonent.");
        }
    }
}
}