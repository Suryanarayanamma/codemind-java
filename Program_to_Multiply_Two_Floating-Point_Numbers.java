import java.util.*;
public class temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=a*b;
        System.out.format("%.2f",c);
    }
}