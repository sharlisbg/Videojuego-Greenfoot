import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roca extends Actor
{
        /**
     * Act - do whatever the roca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    
    public void act()
    {
        //World w = getWorld();
        //move(-5);
        //if (isAtEdge())
        //{
            //w.removeObject(this);
            //setLocation(500, getY());
        //}
        setLocation(getX(), getY()+ speed);
        if (getY() >= getWorld().getWidth()-1){
            Pista4 juego = (Pista4)getWorld();
            juego.removeObject(this);
            juego.aumentar_puntuacion(100);
            juego.disminuir_num_rivales();
            juego.aumentar_num_adelantamientos();
        }
        
    }
    public roca(int v)
    {
        GreenfootImage myImage = getImage();
        int nuevaAltura = (int)myImage.getHeight()/45;
        int nuevoAncho = (int)myImage.getWidth()/45;
        myImage.scale(nuevoAncho, nuevaAltura);
        
        move(-5);
        speed = v;
        
    }
}
