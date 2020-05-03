
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables
    private static final int MAX_DEMON_HP = 50;
    private static final int MIN_DEMON_HP = 15;
    private static final int MAX_DEMON_STR = 25;
    private static final int MIN_DEMON_STR = 10;
    
    
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super(
            Randomizer.nextInt(MAX_DEMON_HP - MIN_DEMON_HP) + MIN_DEMON_HP, 
            Randomizer.nextInt(MAX_DEMON_STR - MIN_DEMON_STR) + MIN_DEMON_STR
        );
    }

    public int damage()
    {
        if (Randomizer.nextInt(100) + 1 <= 5)
        {
            return (Randomizer.nextInt(str) + 1) + 50;
        }
        else
        {
            return Randomizer.nextInt(str) + 1;
        }
    }    

}
