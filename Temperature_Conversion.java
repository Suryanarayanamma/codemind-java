import java.util.*;
public class temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        double f;
        c=sc.nextInt();
        f=32+(c*1.8);
        System.out.format("%.2f",f);
    }
}