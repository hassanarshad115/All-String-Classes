import java.util.Random;
public class AreaVolumRandom {
    public static void main(String []args)
    {
    Random sc =new Random();
    
    int r,h;
    double volume,area;
    
    r=sc.nextInt(10)+1;
    h=sc.nextInt(10)+1;
    
    volume=Math.PI*(r*r)*h;
    area=Math.PI*2*r*h;
    
    System.out.println("the volume is="+volume);
    System.out.println();
    System.out.println("the area is="+area);
   }
}