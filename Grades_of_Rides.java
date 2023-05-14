import java.util.*;
public class Grade
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int hf,sf,spf,grade=0;
     hf=sc.nextInt();
     sf=sc.nextInt();
     spf=sc.nextInt();
     if(hf>50 && sf>60 && spf>100)
        grade = 10;
        else if(hf>50 && sf>60)
        grade = 9;
        else if(sf>60 && spf>100)
        grade = 8;
        else if(hf>50 && spf>100)
        grade = 7;
        else if(hf>50 || sf>60 || spf>100)
        grade = 6;
        else grade = 5;
        System.out.println(grade);
        sc.close();
  }
}