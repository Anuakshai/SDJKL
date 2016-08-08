import java.util.*;
public class repeated_elements {
  public static void main(String ar[])throws Exception
  {
    int n,p,t;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++)
    ar[i]=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(ar[i]>ar[j])
        {
          t=ar[i];
          ar[i]=ar[j];
          ar[j]=t;
        }
      }
    }
    for(int i=0;i<n-1;i++)
    {
      if(ar[i]==ar[i+1])
      {
        System.out.println(ar[i]);
      }
    }
  }
}