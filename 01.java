import java.util.Scanner;

class first
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num1 ");
    int a=sc.nextInt();
    int b=5,c=6;
    int max;
    if(a>=b && a>=c)
    {
      max =a;
    }
    if(a>=b && a>=c)
    {
      max =a;
    }
    else if(b>=a && b>=c)
    {
      max =b;
    }else
    {
      max =c;
    }
    System.out.println("The greatest of three number is "+max);
  }

}