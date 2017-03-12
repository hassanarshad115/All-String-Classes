import java.util.Random;
public class Number
{
public static void main(String[] args)
{
Random rand=new Random();
int a ,b;
System.out.println("enter the value of a");
a=rand.nextInt();
System.out.println("enter the value of b");
b=rand.nextInt();

System.out.println("atan is \t"+Math.atan(b));

System.out.println("tan is \t"+Math.tan(b));

System.out.println("cos is \t"+Math.cos(a));
System.out.println("acos is \t"+Math.acos(a));


System.out.println("pow is \t"+Math.pow(a, b));

System.out.println("max is \t"+Math.max(a, b));

System.out.println("min is \t"+Math.min(a, b));
System.out.println("ceil is \t"+Math.ceil(a));
System.out.println("floor is \t"+Math.floor(a));


}
}
