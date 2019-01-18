import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**

 *

 * @author R. Springer

 */

public class StartScherm extends World {



    private CollisionEngine ce;



    /**

     * Constructor for objects of class MyWorld.

     *

     */

    public StartScherm() {

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(800, 600, 1, false);

        this.setBackground("Night3.png");



        //startScreen();

        TileEngine te = new TileEngine(this, 60, 60);

        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 

        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera

        Camera camera = new Camera(te);

        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 

        // moet de klasse Mover extenden voor de camera om te werken

        Hero hero = new Hero();



        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.

        camera.follow(hero);



        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies

        addObject(camera, 0, 0);





        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.

        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.

        ce = new CollisionEngine(te, camera);

        // Toevoegen van de mover instantie of een extentie hiervan

        ce.addCollidingMover(hero);



        prepare();

    }



    public void act() {

        ce.update();

    }



    /**

     * Prepare the world for the start of the program.

     * That is: create the initial objects and add them to the world.

     */

    private void prepare()

    {
         if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new Level1());
       
        Start start = new Start();
        addObject(start,417,353);
    }
    

}