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
public class Punkt3D extends Punkt2D{
    
    public int z;

    public Punkt3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }
    
    @Override
    public String toString() {
        return "("+super.getX()+","+super.getY()+","+z+")";
    }

    public int rand(){
        Random rand = new Random();
        int r=rand.nextInt(21)-10;
        return r;
    }
    
    
    
}
