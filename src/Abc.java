//hassan arshad 0332-2488111
    //random class r scanner class import hoe ha

    import java.util.Scanner;
    import java.util.Random;
public class Abc       
{
public static void main(String[] args)
{
    //random class m r name ka obj bnaya ha
    Random r = new Random();
    
int randomNum ;
String FirstName;
String LastName;
String Result;

Scanner  input = new Scanner(System.in);

System.out.print("Please Enter First Name: ");
FirstName=input.next();

System.out.print("Please Enter Last Name: ");
LastName=input.next();

System.out.println("Name is:"+FirstName+" "+LastName);
//10 sy start hoga r 89 step agy randomly koi b digiit wo ly skta ha
 randomNum = r.nextInt(89)+ 10;
 
//0 sy strt hota ha word r jha tk jana ho utny digit ka nbr likh dia jta ha
Result=FirstName.substring(0,1)+LastName.substring(0,5)+randomNum;
//result ma stor hogya ta sbi islye result ko display krwwadia
System.out.println("Output is:"+Result);

}

}

    
    


    

