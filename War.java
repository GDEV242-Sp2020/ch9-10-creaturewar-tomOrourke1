import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Write a description of class War here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class War
{
    ArrayList<Creature> army1, army2;
    
    
    private int armySize = 100;
    
    
    
    /**
     * Constructor for objects of class War
     */
    public War()
    {
        start();
    }
    private void start()
    {
        army1 = new ArrayList<Creature>();
        army2 = new ArrayList<Creature>();        
    }
    
    public void startWar()
    {
        if(army1 == null || army2 == null)
            start();
        
        
        createArmy(armySize);
        
        
        
        fight();
        
        
        
    }
    /**
     * createArmy creates two armies of the same size
     * I made it so both armies can get the same troops 
     * I wanted this so it would be more of a fair fight
     * and the demonic troops have a much lower chance of being used then the others
     */
    private void createArmy(int size)
    {
        for(int i = 0; i < size; i++)
        {
            int rando = Randomizer.nextInt(10) + 1;
            if(rando < 6 )
            {
                army1.add(new Human());
            }   
            else if(rando < 8)
            {
                army1.add(new Dwarf());
                
            }
            else if (rando < 10)
            {
                army1.add(new Elf());
            }
            else
            {
                rando = Randomizer.nextInt(3) + 1;
                if (rando ==1)
                {
                     army1.add(new Demon());   
                }
                else if(rando == 2)
                {
                    army1.add(new CyberDemon());
                }
                else
                {
                    army1.add(new Balrog());
                }
            }
            
            rando = Randomizer.nextInt(10) + 1;
            if(rando < 6)
            {
                army2.add(new Human());
            }
            else if (rando < 8)
            {
                army2.add(new Dwarf());
            }
            else if (rando < 10)
            {
                army2.add(new Elf());
            }
            else
            {
                rando = Randomizer.nextInt(3) + 1;
                if (rando ==1)
                {
                     army2.add(new Demon());   
                }
                else if(rando == 2)
                {
                    army2.add(new CyberDemon());
                }
                else
                {
                    army2.add(new Balrog());
                }
            }   
        }
        
        
        
        
        
    }
    
    
    /**
     * This method fights the enemies in a look or two
     */
    private void fight()
    {
        boolean fighting = true;
        int turn = 1;
        while(fighting)
        {
            //System.out.println("Just started");
            
            switch(turn)
            {
                case 1:
                    Collections.shuffle(army1);
                    Collections.shuffle(army2);
                    if(army1.size() > 0 && army2.size() > 0)
                    {
                        army2.get(0).takeDamage(army1.get(0).damage());
                        if(army2.get(0).isDead())
                        {
                            army2.remove(0);
                        }
                        turn = 2;
                    }
                    else
                    {
                        turn = 3;
                    }
                    
                    break;
                case 2:
                    Collections.shuffle(army1);
                    Collections.shuffle(army2);
                    if (army2.size() > 0 && army1.size() > 0)
                    {
                        army1.get(0).takeDamage(army2.get(0).damage());
                        if(army1.get(0).isDead())
                        {
                            army1.remove(0);
                        }
                        turn = 1;
                    }
                    else
                    {
                        turn = 3;
                    }
                    
                    break;
                default:
                    fighting = false;
                    if(army2.size() > 0 && army1.size() <= 0)
                        System.out.println("army2 wins");
                    if(army2.size() <= 0 && army1.size() > 0)
                        System.out.println("army1 wins");
                    break;                
            }
            
            
            
            
        }
        
    }
    
}
