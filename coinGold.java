import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class slimeWalk1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coinGold extends Mover
{ public static String image;
    public static int AantalcoinGold;
    public coinGold() {setImage("coinGold.png");
 
    }

    @Override
    public void act() {
      
        applyVelocity();
        
    }
}