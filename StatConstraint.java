
/**
 * Write a description of class StatConstraint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StatConstraint
{

    public StatConstraint()
    {
        
    }
    public static int inHp(int x,int max, int min)
    {
        if( x > max)
            x = max;
        if(x < min)
            x = min;
        return x;
    }
    public static int inStr(int x,int max, int min)
    {
        if( x > max)
            x = max;
        if(x < min)
            x = min;
        return x;     
    }     
}
