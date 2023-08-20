import java.util.*;
public class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0,q;
        n=sc.nextInt();
        q=n;
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(q==s)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}