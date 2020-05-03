
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Creature
{
    // instance variables
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;   
    
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_BALROG_HP - MIN_BALROG_HP) + MIN_BALROG_HP, 
            Randomizer.nextInt(MAX_BALROG_STR - MIN_BALROG_STR) + MIN_BALROG_STR
        );         
    }
    /**
     * overide for damage
     */
    public int damage()
    {
        return (Randomizer.nextInt(str) + 1) + (Randomizer.nextInt(str) + 1);
    }   
}
