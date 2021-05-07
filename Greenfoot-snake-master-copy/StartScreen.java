import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(25, 20, 32); 
        prepare();
    }

    private void prepare()
    {
        TitleLetters titleletters = new TitleLetters();
        addObject(titleletters, 400, 300);

        titleletters.setLocation(12,18);

        TitleLetters1 titleLetters1 = new TitleLetters1();
        addObject(titleLetters1,12,2);
        TitleLetters3 titleLetters3 = new TitleLetters3();
        addObject(titleLetters3,9,9);
        titleLetters3.setLocation(6,11);
        titleLetters3.setLocation(6,12);
        titleLetters3.setLocation(6,10);
        titleLetters3.setLocation(6,12);
        TitleLetters2 titleLetters2 = new TitleLetters2();
        addObject(titleLetters2,18,10);
        titleLetters3.setLocation(7,11);
        titleLetters3.setLocation(6,12);
        titleLetters3.setLocation(6,13);
        titleLetters2.setLocation(17,11);
        titleLetters3.setLocation(8,10);
    }

   
    public void act()
    {
     if(Greenfoot.isKeyDown("enter"))
     Greenfoot.setWorld(new SnakeWorld());
    }
}
