
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    // instance variables
    private static final int MAX_HUMAN_HP = 25;
    private static final int MIN_HUMAN_HP = 5;
    private static final int MAX_HUMAN_STR = 20;
    private static final int MIN_HUMAN_STR = 5;
       
    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        super(
            Randomizer.nextInt(MAX_HUMAN_HP - MIN_HUMAN_HP) + MIN_HUMAN_HP, 
            Randomizer.nextInt(MAX_HUMAN_STR - MIN_HUMAN_STR) + MIN_HUMAN_STR
        );
        
    }
    public Human(int iHp, int iStr)
    {
        super(
            StatConstraint.inHp(iHp,MAX_HUMAN_HP,MIN_HUMAN_HP),
            StatConstraint.inStr(iStr,MAX_HUMAN_STR, MIN_HUMAN_STR)
        );       
    }
    public void printMe()
    {
        System.out.println(super.damage());
    }
}
