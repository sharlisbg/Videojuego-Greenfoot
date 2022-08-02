import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class meta extends Actor
{
    /**
     * Act - do whatever the meta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Addyour action code here.
        
    }
    public meta()
    {
        GreenfootImage myImage = getImage();
        int nuevaAltura = (int)myImage.getHeight()/10;
        int nuevoAncho = (int)myImage.getWidth()/10;
        myImage.scale(nuevoAncho, nuevaAltura);
    
    }
}
