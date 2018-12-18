
import greenfoot.Actor;
import greenfoot.Greenfoot;




/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    

    public Hero() {
        super();
        gravity = 4.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
    }

    public void handleInput() {
 
         if(Greenfoot.isKeyDown("space")) {
            setImage("p1.png");
            velocityY = -20;
        }  
        if (Greenfoot.isKeyDown("a")){
            setImage("p1_front.png");
            velocityX = -3;
        } else if (Greenfoot.isKeyDown("d")) {
            setImage("p1_walk05.png");
            velocityX = 2;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
    
}
//hi hallo 