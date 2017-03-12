



public class Chair   //chair name ki ak class declare kerni ha
{
private int legs;          //private k sath legs int type ka 
private String color;     //private k sath color String type k sath S bra

//class ma phla method constructor bnta ha hmesha
public Chair (  )  //constructor bnana h sbsy phly construcor bnta h
        
{
    //value dyny k lye ye bnaty ha
legs=0;
color=" ";    //constructor ko phly value assign krni hoti ha

}
//method ki ilamat ( ) hoti ha r mehtod hmesha public hoga
//method k sath void lgta ha
//set k sath void ata ha r get k sath jo data type d hogi wo ayge
public void setlegs(int l)    //method bnana 
{
    //legs ma l ki valie ajayge
legs=l;
}

public void setcolor(String c)
{
    //color ma c ki value ajayge
color=c;
}
//set m value d jati ha r get ma return wgra krwaty ha
public int getlegs()
{
return legs;
}
public String getcolor()
        
{
return color;
}


} //class end 