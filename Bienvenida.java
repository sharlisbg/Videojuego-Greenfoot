import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class instrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bienvenida extends World
{
    cubo flecha = new cubo();
    private int opcion=0;

    /**
     * Constructor for objects of class instrucciones.
     * 
     */
    public Bienvenida()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepararMundo();
        prepare();
    }

    private void prepararMundo(){
        addObject(new Jugar(), 350, 300);
        addObject(new Salir(), 350, 350);
        addObject(flecha, 250, 300);
    }

    public void act(){
        if(Greenfoot.isKeyDown("UP") && opcion!=0) {
            Greenfoot.playSound("click.wav");
            opcion++;
        }
        if(Greenfoot.isKeyDown("DOWN") && opcion!=1) {
            Greenfoot.playSound("click.wav");
            opcion--;
        }

        if(opcion>=2) opcion = 0;
        if (opcion<0) opcion = 1;

        flecha.setLocation(250,300 +(opcion*50));

        if(Greenfoot.isKeyDown("SPACE")){
            switch(opcion){
                case 0:
                    Greenfoot.playSound("click.wav");
                    Greenfoot.setWorld(new Pista1());
                    break;
                case 1:
                    Greenfoot.stop();
                    break;
            }
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
