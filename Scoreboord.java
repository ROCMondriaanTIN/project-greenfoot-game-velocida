import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scorebord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboord extends Actor
{
    public int teller = 0;
    
    public void act() 
    {
     getWorld().showText("Score is "+ teller, 50, 50);   
    }   
    public void telCoin(String color){
        if(color == "gold"){
         teller = teller +2 ;     
        }  
        else if(color == "silver"){
           teller = teller +1;  
        }    
    }
    
    
}
