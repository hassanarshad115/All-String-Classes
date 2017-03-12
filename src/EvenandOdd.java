import java.util.Scanner;
public class EvenandOdd {
    public static void main(String []args)
    {
    Scanner sc=new Scanner(System.in);
    
    int n;
    System.out.println("enter the value of n=");
    n=sc.nextInt();
    //if k bad ; ni ata
    if(isEven(n))
        
    System.out.println("Even number is \t"+n);
    else
        System.out.println("Odd number is \t"+n);

    
    
    
    }
   static boolean isEven(int num)
    {
    if(num%2==0)
        return true;
    else
        return false;
    
    
    
    }
    
    
}
