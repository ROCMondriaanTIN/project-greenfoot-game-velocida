import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class slimeWalk1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gold extends Coin
{   public boolean isGepakt; 
    public Gold(boolean isGepakt) {
        this.isGepakt = isGepakt;
        
    }

  
    public void act() {
      if(isGepakt == false){
        applyVelocity(); 
        
        }
       
        
    }
}