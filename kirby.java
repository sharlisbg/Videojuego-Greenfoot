import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kirby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kirby extends Actor
{
    private int speed; 
    
    public kirby()
    {
        GreenfootImage myImage = getImage();
        int nuevaAltura = (int)myImage.getHeight()/18;
        int nuevoAncho = (int)myImage.getWidth()/18;
        myImage.scale(nuevoAncho, nuevaAltura);
    }
    
    /**
     * Act - do whatever the kirby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAllAround();
        if (isTouching(meta.class))
        {
            Greenfoot.playSound("completar.wav");
            Greenfoot.delay(50);
            Greenfoot.setWorld(new Pista3());
        }
        
    }

    
    public void moveAllAround() 
    {
        speed = 10;
        if (Greenfoot.isKeyDown("D"))
        {
            Greenfoot.playSound("Topar.wav");
            setLocation(getX()+speed, getY());
            Pista2 juego = (Pista2)getWorld();
            juego.aumentar_puntuacion(100);
            if (isTouching(cuadro.class))
            {
                Greenfoot.playSound("Topar.wav");
                setLocation(getX()-speed, getY());;
            } 
        }
        if (Greenfoot.isKeyDown("A"))
        {
            Greenfoot.playSound("Topar.wav");
            setLocation(getX()-speed, getY());
            Pista2 juego = (Pista2)getWorld();
            juego.aumentar_puntuacion(100);
            if (isTouching(cuadro.class))
            {
                Greenfoot.playSound("Topar.wav");
                setLocation(getX()+speed, getY());;
            }
        }
        if (Greenfoot.isKeyDown("W"))
        {
            Greenfoot.playSound("Topar.wav");
            setLocation(getX(), getY()-speed);
            Pista2 juego = (Pista2)getWorld();
            juego.aumentar_puntuacion(100);
            if (isTouching(cuadro.class))
            {
                Greenfoot.playSound("Topar.wav");
                setLocation(getX(), getY()+speed);;
            }
        }
        if (Greenfoot.isKeyDown("S"))
        {
            Greenfoot.playSound("Topar.wav");
            setLocation(getX(), getY()+speed);
            Pista2 juego = (Pista2)getWorld();
            juego.aumentar_puntuacion(100);
            if (isTouching(cuadro.class))
            {
                Greenfoot.playSound("Topar.wav");
                setLocation(getX(), getY()-speed);;
            }
        }
    }
}
