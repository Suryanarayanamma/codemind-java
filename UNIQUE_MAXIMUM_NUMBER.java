import java.util.Scanner;
import java.lang.*;
public class UniqueMaximum
{
  public static void unique(int arr[],int size)
  {
     int count=0,flag=0,max=-999999;
	 for(int i=0;i<size;i++)
	 { 
	    if(arr[i]!=-1)
		{
		    count=1;
		   for(int j=i+1;j<size;j++)
		   {
		     if(arr[i]==arr[j])
			   { count++;
			      arr[j]=-1; 
			   }
		   } 
		  if(count==1)
		  {
		     flag=1;
		     if(arr[i]>max)
		        max=arr[i];
		  }
		}	
	 }
	 if(flag==0)
	   System.out.println("-1");
	 else
	    System.out.println(max);
	
  }
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     int n,x[],i;
     n=sc.nextInt();
     x=new int[n];
     for(i=0;i<n;i++)
      x[i]=sc.nextInt();
      unique(x,n);	 
 }
}
