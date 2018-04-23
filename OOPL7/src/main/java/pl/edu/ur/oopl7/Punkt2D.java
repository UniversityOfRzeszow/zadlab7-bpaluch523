/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;
import java.util.Random;
/**
 *
 * @author Bartek
 */
public class Punkt2D {
    
    public int x;
    public int y;
    
    public Punkt2D(){
        this.x=0;
        this.y=0;
    }
    
    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "("+x+","+y+")"; //To change body of generated methods, choose Tools | Templates.
    }
    
    public int rand(){
        Random rand = new Random();
        int r=rand.nextInt(21)-10;
        return r;
    }
    
    
}
