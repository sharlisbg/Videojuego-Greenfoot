import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cubo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cubo extends Actor
{
    /**
     * Act - do whatever the cubo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public cubo()
    {
        GreenfootImage myImage = getImage();
        int nuevaAltura = (int)myImage.getHeight()/2;
        int nuevoAncho = (int)myImage.getWidth()/2;
        myImage.scale(nuevoAncho, nuevaAltura);
    }
}
