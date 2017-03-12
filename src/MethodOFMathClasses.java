import java.util.Random;

public class MethodOfMathClasses
{

public static void main (String []args)
{
//random import krwaya h tbi random obj lia ha
    
Random as = new Random();
//veriable declare
int  n;
//idhr sy kam start
//phly veriable fr = fr obj ka name fr data type dkh kr next k sath lgay fr();
n=as.nextInt(21)+20;
//random nbr simple
System.out.println("RANDOM NUMBER IS="+n);
System.out.println();
//sin or asin 
System.out.println("RANDOM NUMBER sin IS="+Math.sin(n));
System.out.println("RANDOM NUMBER Asin IS="+Math.asin(n));

System.out.println();

//tan r atan
System.out.println("RANDOM NUMBER tan IS="+Math.tan(n));
System.out.println("RANDOM NUMBER Atan IS="+Math.atan(n));

System.out.println();
//cos r acos
System.out.println("RANDOM NUMBER cos IS="+Math.cos(n));
System.out.println("RANDOM NUMBER Acos IS="+Math.acos(n));
System.out.println();
//ceil r floor
System.out.println("RANDOM NUMBER floor IS="+Math.floor(n));
System.out.println("RANDOM NUMBER ceil IS="+Math.ceil(n));
System.out.println();
//square root r pow
System.out.println("RANDOM NUMBER sqrt IS="+Math.sqrt(n));
System.out.println("RANDOM NUMBER power IS="+Math.pow(n,2));
System.out.println();
//random class k sath
System.out.println("RANDOM NUMBER random IS="+Math.random());




}
}