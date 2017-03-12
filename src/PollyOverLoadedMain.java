
public class PollyOverLoadedMain {
    public static void main(String []args)
    {
    
    PollyOverLoaded p=new PollyOverLoaded();
    //for double we initialize any name of veriables
    double x;
    p.poly(5);
    
    p.poly(10, 20);
    
    //for double
    x=p.poly(5.5);
    System.out.println("the vale of x in double \t"+x);
    
    
    
    }
}
