import  java.util.Scanner ;
public class Java10
{
 public static void main (String[] args) 
 {                                                                                                      
      Scanner sc = new Scanner (System.in);
     int  numerator,denominator;
     Double fraction;
       System.out.println("Enter Numerator: ");
         numerator = sc.nextInt();
        System.out.println("Enter Denominator: ");
         denominator = sc.nextInt();
        if (denominator == 0) 
        {
           System.out.println("Can't divide by zero");
        }
        else {
             fraction = (double)numerator / denominator;
            System.out.println(fraction);
        }

 }
}