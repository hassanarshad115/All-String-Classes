//yee driver class ha r Die iski drived class ha

public class RollingDice
{
//-----------------------------------------------------------------
// Creates two Die objects and rolls them several times.
//-----------------------------------------------------------------
public static void main (String[] args)
{
    //Die die1=new Die () ki jga use kia ha
        //Die die2=new Die () ki jga use kia ha

Die die1, die2;
int sum;

die1 = new Die();
die2 = new Die();
//random value access krny k lye
die1.roll();
die2.roll();

System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
die1.roll();
die2.setFaceValue(4);
//face vlue 4 fix ki hoe ha is lye 4 he ayge
System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
//sum of die1 rollfacevalue ,die2 setfacevalue k lye
sum = die1.getFaceValue() + die2.getFaceValue();
System.out.println ("Sum: " + sum);
//sum of dono roll facevalue k lyee
sum = die1.roll() + die2.roll();
System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
System.out.println ("New sum: " + sum);
}
}