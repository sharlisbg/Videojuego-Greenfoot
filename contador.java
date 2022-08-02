import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class contador extends Actor
{
    /**
     * Act - do whatever the contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int value = 0;
    private int target =0;
    private String text;
    private int stringLength; 
    
    public contador(){
        this("");
    }
    public contador(String prefix){
        text = prefix;
        stringLength = (text.length() +2 )* 16;
        
        setImage(new GreenfootImage(stringLength, 15));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(15.0F));
        image.setColor(Color.BLACK);
        
        updateImage();
        
    }
    
    public void act()
    {
        // Add your action code here.
        if(value < target) {
         value++;
         updateImage();
        }
    }
    public void add(int score){
        target +=score;    
    }
    public void subtract(int score){
        target -= score;
    }
    public int getValue(){
        return value; 
    }
    private void updateImage(){
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 10);
    }
}
