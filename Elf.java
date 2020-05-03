
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_HP - MIN_ELF_HP) + MIN_ELF_HP, 
            Randomizer.nextInt(MAX_ELF_STR - MIN_ELF_STR) + MIN_ELF_STR
        );
    }

    public int damage()
    {
        if (Randomizer.nextInt(10) + 1 == 10)
        {
            return (Randomizer.nextInt(str) + 1) * 2;
        }
        else
        {
            return Randomizer.nextInt(str) + 1;
        }
    }
    
    
}
