
    import java.util.Scanner;
    import java.util.Random;
    
public class Random       
{
public static void main(String[] args)
{
    Random r = new Random();
//Initialise Variables
String FirstName;
String LastName;
String Result;
//create object
Scanner  input = new Scanner(System.in);

//prompts the user to enter firstname 
System.out.print("Please Enter First Name: ");
FirstName=input.next();

//prompts the user to enter lastname
System.out.print("Please Enter Last Name: ");
LastName=input.next();

//Display Name
System.out.println("Name is:"+FirstName+" "+LastName);

//To generate Random Numbers within 10 to 99
  // int randomNum=(int)( Math.random(99)+10);
  //int randomNum = 10 + (int)(Math.random()*99);



Result=FirstName.substring(0,1)+LastName.substring(0,5);

//To display the output.
System.out.println("Output is:"+Result);

}

}

    
    
