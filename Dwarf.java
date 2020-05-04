
/**
 * Write a description of class Dwarf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dwarf extends Creature
{
    // instance variables
    private static final int MAX_DWARF_HP = 30;
    private static final int MIN_DWARF_HP = 10;
    private static final int MAX_DWARF_STR = 45;
    private static final int MIN_DWARF_STR = 15;
       
    /**
     * Constructor for objects of class Human
     */
    public Dwarf()
    {
        super(
            Randomizer.nextInt(MAX_DWARF_HP - MIN_DWARF_HP) + MIN_DWARF_HP, 
            Randomizer.nextInt(MAX_DWARF_STR - MIN_DWARF_STR) + MIN_DWARF_STR
        );
        
    }


}
