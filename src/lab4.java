import java.util.*;
public class lab4
{
    public static void main(String m[])
    {
        Scanner in=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter a name:");
        s=in.nextLine();
        char c;
        int ct=0;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);      
            if(c>=65 && c<=90)
            {
                ct++;
            }
        }
        System.out.println(" capital letters  :"+ct);
    }
}