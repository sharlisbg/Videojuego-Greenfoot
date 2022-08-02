import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pista4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pista4 extends World
{
    private contador score;
    private int velocidad_kirby;
    private int num_adelantamientos;
    private int num_adelantamientos_nivel;
    private kirby2 personaje;
    private int num_rivales;

    /**
     * Constructor for objects of class Pista2.
     * 
     */
    public Pista4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(475, 550, 1); 
        num_adelantamientos = 0;
        num_adelantamientos_nivel = 25;
        velocidad_kirby = 12;

        score = new contador("Score: ");
        personaje = new kirby2(velocidad_kirby);

        addObject(personaje, 250,350);
        addObject(score, 120,50);
        instrucciones1 instrucciones1 = new instrucciones1();
        addObject(instrucciones1,156,499);
        instrucciones1.setLocation(324,499);
        instrucciones1.setLocation(135,495);
        instrucciones1.setLocation(220,500);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    /*private void prepare()
    {
    kirby2 kirby2 = new kirby2();
    addObject(kirby2,257,396);
    kirby2.setLocation(233,364);
    instrucciones1 instrucciones1 = new instrucciones1();
    addObject(instrucciones1,156,499);
    instrucciones1.setLocation(324,499);
    instrucciones1.setLocation(135,495);
    instrucciones1.setLocation(220,500);
    kirby2.setLocation(36,270);
    } */

    public void act(){
        anadir_rivales();     
        if (score.getValue() == 500){
            Greenfoot.playSound("completar.wav");
            Greenfoot.delay(20);
            Greenfoot.setWorld(new pistaF());
        }
    }

    public int getRandomNumber(int start, int end) {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }

    public void aumentar_puntuacion(int valor){
        score.add(valor);
    }

    public void aumentar_num_adelantamientos(){
        num_adelantamientos++;
    }

    public void disminuir_num_rivales(){
        num_rivales--;
    }

    public void anadir_rivales(){
        if (num_rivales == 0){
            int carril = getRandomNumber(0,4);

            if(carril == 0){
                addObject(new roca(velocidad_kirby), 50, 80);
            }
            else if(carril == 1){
                addObject(new roca(velocidad_kirby), 170, 80);
            }
            else if(carril == 2){
                addObject(new roca(velocidad_kirby), 290, 80);
            }
    
            else {
                addObject(new roca(velocidad_kirby), 410, 80);
            }

            carril ++;
            carril = carril % 4;

            if(carril == 0){
                addObject(new roca(velocidad_kirby), 50, 80);
            }
            else if(carril == 1){
                addObject(new roca(velocidad_kirby), 170, 80);
            }
            else if(carril == 2){
                addObject(new roca(velocidad_kirby), 290, 80);
            }
    
            else {
                addObject(new roca(velocidad_kirby), 410, 80);
            }

            carril ++;
            carril = carril % 4;

            if(carril == 0){
                addObject(new roca(velocidad_kirby), 50, 80);
            }
            else if(carril == 1){
                addObject(new roca(velocidad_kirby), 170, 80);
            }
            else if(carril == 2){
                addObject(new roca(velocidad_kirby), 290, 80);
            }
    
            else {
                addObject(new roca(velocidad_kirby), 410, 80);
            }

            num_rivales = 3;
        }
    }
}
