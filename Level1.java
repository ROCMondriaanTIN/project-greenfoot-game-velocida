
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class Level1 extends World {

    private CollisionEngine ce;

    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public Level1() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1, false);
        this.setBackground("night3.jpg");

        int[][] map = {
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,7,7,7,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,12,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,1,1,6,5,5,5,-1,-1,5,5,5,7,8,8,8,8,8,8,8,8,8,-1,-1,-1,7,-1,-1,-1,-1,-1,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,8,8,7},
{7,7,7,7,7,7,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,1,1,1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,7,-1,-1,-1,-1,-1,-1,7,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,8,8,8,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,-1,-1,-1,-1,-1,-1,-1,-1,8,8,6,6,6},
{6,6,6,6,6,6,-1,-1,-1,-1,-1,14,-1,-1,7,8,9,-1,-1,-1,-1,-1,-1,-1,-1,1,0,1,1,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,7,-1,-1,-1,-1,-1,-1,7,-1,-1,-1,8,8,-1,-1,-1,-1,-1,14,-1,-1,-1,-1,-1,-1,7,-1,-1,-1,-1,-1,-1,-1,8,6,6,6,6,6},
{6,6,6,6,6,6,7,7,-1,-1,7,8,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,7,8,8,8,8,9,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,7,-1,-1,-1,-1,-1,-1,1,1,-1,-1,7,6,-1,-1,-1,-1,-1,-1,0,-1,-1,-1,-1,-1,7,-1,-1,-1,-1,-1,-1,-1,8,6,6,6,6,6,6},
{6,6,6,6,6,6,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,7,8,9,9,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,7,5,5,7,-1,-1,7,-1,7,7,7,6,-1,-1,-1,-1,-1,-1,-1,-1,7,7,7,-1,-1,-1,-1,-1,-1,7,7,7,7,7,7,-1,-1,-1,-1,-1,-1,1,1,-1,-1,-1,-1,7,6,-1,-1,-1,-1,-1,-1,8,6,6,6,6,6,6,6},
{6,6,6,6,6,6,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,6,-1,-1,-1,7,7,7,7,7,-1,-1,-1,8,8,8,8,8,8,6,6,6,6,6,6,6,-1,-1,7,7,7,7,7,-1,-1,8,8,7,7,7,7,7,7,7,8,6,6,6,6,6,6,6,6},
{6,6,6,6,6,6,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,6,8,8,9,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11},
{6,6,6,6,6,6,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},

            };

        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
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
        addObject(hero, 300, 200);

        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
        prepare();

    }

    @Override
    public void act() {
        ce.update();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Slime slime2 = new Slime();
        addObject(slime2,948,405);
        //==========================//
        Slime slime3 = new Slime();
        addObject(slime3,2098,530);
        Slime slime4 = new Slime();
        addObject(slime4,2726,293);
        //==========================//
        coinGold coinGold = new coinGold();
        addObject(coinGold,4390,553);
        coinGold coinGold2 = new coinGold();
        addObject(coinGold2,662,461);
        coinGold coinGold3 = new coinGold();
        addObject(coinGold3,3302,461);

       

        Box box = new Box ();
        addObject(box,2156,493);
        Diamant Diamant = new Diamant();
        addObject(Diamant,2150,700);
        //=========================//
        Poker poker = new Poker();
        addObject(poker,5071,553);

        //=========================//
        Key key = new Key();
        addObject(key,2736,613);
        //=========================//
        Deur deur1 = new Deur("door_openMid.png");
        addObject(deur1,5677,273);
        DeurBoven door = new DeurBoven();
        addObject(door,5677,215);

        //=========================//
        Music music = new Music();
        addObject(music,61,54);
        music.getClass();
        //=========================//
        RozeKarakter rozeKarakter = new RozeKarakter();
        addObject(rozeKarakter,1543,433);
        rozeKarakter.setLocation(1543,433);

        Snail snail2 = new Snail();
        addObject(snail2,4384,600);

        Snail snail = new Snail();
        addObject(snail,3521,593);

        LockYellow lockYellow = new LockYellow();
        addObject(lockYellow,3613,553);

         DiamantHud diamantHud = new DiamantHud();
        addObject(diamantHud,166,92);

        Aantalcoin Aantalcoin = new Aantalcoin();
        addObject(Aantalcoin,185,58);
        coinGold_hud coinGold_hud = new coinGold_hud();
        addObject(coinGold_hud,146,55);
        
        HartHud hartHud = new HartHud();
        addObject(hartHud,59,134);
        Hud_Key hud_Key = new Hud_Key();
        addObject(hud_Key,58,189);
 

    }
}