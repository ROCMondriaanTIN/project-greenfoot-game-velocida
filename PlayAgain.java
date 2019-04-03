import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayAgain extends Mover
{

    /*GreenfootSound sound = new GreenfootSound("");*/
    boolean firstTrun = true;

    public void act() 
    {
        // Add your action code here.

        
        if(Greenfoot.mouseClicked(this)||Greenfoot.isKeyDown("space")){

            Greenfoot.setWorld(new Level1());
         
        }    

    }}
