import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AantalSters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aantalcoin extends Mover
{
    /**
     * Act - do whatever the AantalSters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  if(coinGold_hud.aantalcoin==0){setImage("hud_0.png");}
        if(coinGold_hud.aantalcoin==1){setImage("hud_1.png");}
    if(coinGold_hud.aantalcoin==2){setImage("hud_2.png");}
     if(coinGold_hud.aantalcoin==3){setImage("hud_3.png");}
      if(coinGold_hud.aantalcoin==4){setImage("hud_4.png");}
       if(coinGold_hud.aantalcoin==5){setImage("hud_5.png");}
        if(coinGold_hud.aantalcoin==6){setImage("hud_6.png");}
         if(coinGold_hud.aantalcoin==7){setImage("hud_7.png");}
          if(coinGold_hud.aantalcoin==8){setImage("hud_8.png");}
           if(coinGold_hud.aantalcoin==9){setImage("hud_9.png");}
        // Add your action code here.
    }    
}
