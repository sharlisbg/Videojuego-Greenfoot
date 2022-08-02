import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kirby2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kirby2 extends Actor
{
    private int speed;
    
    public kirby2(int v)
    {
        GreenfootImage myImage = getImage();
        int nuevaAltura = (int)myImage.getHeight()/10;
        int nuevoAncho = (int)myImage.getWidth()/10;
        myImage.scale(nuevoAncho, nuevaAltura);
        
        speed = v;
    }
    public void act()
    {
        moveAllAround();
    }
    
    public void moveAllAround() 
    {
        speed = 10;
        if (Greenfoot.isKeyDown("D"))
        {
            Greenfoot.playSound("Topar.wav");
            setLocation(getX()+speed, getY());
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
            if (isTouching(cuadro.class))
            {
                Greenfoot.playSound("Topar.wav");
                setLocation(getX()+speed, getY());;
            }
        }
    }
    
    public void checkCollision(){
        Actor collided = getOneIntersectingObject(roca.class);
        if (collided !=null){
            getWorld().removeObject(collided);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
}
