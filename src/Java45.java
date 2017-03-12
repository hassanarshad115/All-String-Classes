/*

PP 3.3 Write an application that creates and prints a random phone
number of the form XXX–XXX–XXXX. Include the dashes in
the output. Do not let the first three digits contain an 8 or 9
(but don’t be more restrictive than that), and make sure that the
second set of three digits is not greater than 742. Hint: Think
through the easiest way to construct the phone number. Each
digit does not have to be determined separately.


*/



import java.util.Random;
public class Java45 
{
  public static void main (String[] args)
  {
    Random  rand = new Random();
    int  num1, num2, num3;

    num1 = (rand.nextInt(7) + 1) * 100     + (rand.nextInt(8) + 0)  * 10       + ( rand.nextInt(8) + 0);
    num2 = rand.nextInt (743)+100 ;
    num3 = rand.nextInt (9000) + 1000;

    System.out.println(num1+"-"+num2+"-"+num3);
  }
}
