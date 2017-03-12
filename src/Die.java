public class Die
{
    //daany par fix krdia 6 tk ho
private final int MAX = 6; // maximum face value
private int faceValue; // current value showing on the die
//-----------------------------------------------------------------
// Constructor: Sets the initial face value.
//-----------------------------------------------------------------
public Die()
{
faceValue = 1;
}
//-----------------------------------------------------------------
// Rolls the die and returns the result.
//-----------------------------------------------------------------
public int roll()
{
    //0 sy 5 tk ta max ma mgr +1 ki wja sy 1 plus hojayga yni 4 ay tw 5
faceValue = (int)(Math.random() * MAX) + 1;
return faceValue;
}
//-----------------------------------------------------------------
// Face value mutator.
//-----------------------------------------------------------------
public void setFaceValue (int value)
{
faceValue = value;
}
//-----------------------------------------------------------------
// Face value accessor.
//-----------------------------------------------------------------
public int getFaceValue()
        {
return faceValue;
}
//-----------------------------------------------------------------
// Returns a string representation of this die.
//-----------------------------------------------------------------
public String toString()
{
String result = Integer.toString(faceValue);
return result;
}
}