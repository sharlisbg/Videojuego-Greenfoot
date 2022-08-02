import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cuadro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cuadro extends Actor
{
    public cuadro()
    {
        GreenfootImage myImage = getImage();
        int nuevaAltura = (int)myImage.getHeight()/2;
        int nuevoAncho = (int)myImage.getWidth()/2;
        myImage.scale(nuevoAncho, nuevaAltura);
    }
    
    /**
     * Act - do whatever the cuadro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
