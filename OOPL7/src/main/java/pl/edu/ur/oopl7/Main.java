/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author Bartek
 */
public class Main {
    
    public static void main(String[] args){
        
        Punkt2D pkt1=new Punkt2D(0,0);
        pkt1.x=pkt1.rand();
        pkt1.y=pkt1.rand();
        
        System.out.println("Punkt testowy 2d: "+pkt1.toString());
        
        Punkt3D pkt2=new Punkt3D(0,0,0);
        pkt2.x=pkt2.rand();
        pkt2.y=pkt2.rand();
        pkt2.z=pkt2.rand();
        
        System.out.println("Punkt testowy 3d: "+pkt2.toString());
        
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];
        
         for (int i=1; i<100 ; i++){
               
            }
            
        for (int i=1; i<100 ; i++){
                
            }
        
    }
    
}
