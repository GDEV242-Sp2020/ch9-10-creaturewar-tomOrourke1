import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Creature
{
   protected int str;
   protected int max_hp;
   protected int hp;
   
   private Random rand = new Random();
   
   /**
     * default constructor - this should never actually run
     */   
   public Creature()
   {
       str = 10;
       hp = 10;
       max_hp = hp;
   }
   
   /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
     */
   public Creature (int iStr, int iHp) 
   {
       str = iStr > 5 ? iStr : 5;
       hp = iHp > 5 ? iHp : 5;       
       max_hp = hp;
   }    
   /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
   public int damage()
   {
        return Randomizer.nextInt(str) + 1;
   }
   /**
     * Is this creature still capable of fighting?
     * @return true when current hit point level is greater than zero
     */
   public boolean isAlive() 
   {
       return hp > 0;
   }
   /**
     * Is this creature deceased?
     * @return true when current hit point level is less than or equal to zero
     */
   public boolean isDead() 
   {
        return hp <= 0;
   }   
    
   /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * @param damage value to remove from hit point count
     */
   public void takeDamage(int damage) 
   {
        hp -= damage;
   }    
    
    
    
    
    
    
    
    
    
    
}
