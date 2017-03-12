     //import java.util.Scanner;
    import java.util.*;

    public class CubeSum {

        public static void main (String args []) {

            Scanner scan = new Scanner(System.in);

            int i1, i2, cube1, cube2;
            
            System.out.print("integer1: ");
            i1=scan.nextInt();

            cube1 = (int)Math.pow(i1 ,2);

            System.out.print("integer2: ");
             i2=scan.nextInt();

            cube2 = (int)Math.pow(i2 ,3);

            System.out.println("the sum of these cubes is: " + (cube1 + cube2));

        }
    }

    

