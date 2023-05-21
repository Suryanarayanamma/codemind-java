import java.util.Scanner;
public class Bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String id,name;
        int un;
        float amt;
        id=sc.nextLine();
        name=sc.nextLine();
        un=sc.nextInt();
         if(un<200)
            amt=un*1.20f;
        else if(un>=200 && un<400)
            amt=un*1.50f;
        else if(un>=400 && un<600)
            amt=un*1.80f;
        else
            amt=un*2.00f;
        
        if(amt>400)
            amt=amt+0.15f*amt;
        else
            amt=amt+100;
        System.out.format("%.2f",amt);
    }
}