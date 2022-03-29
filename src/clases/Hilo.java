/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author JEAN SAID
 */
public class Hilo implements Runnable{
    private int Vector[];
    

    public Hilo(int[] Vector) {
        this.Vector = Vector;
    }
    @Override
    public void run(){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < this.Vector.length; i++) {
            if(this.Vector[i]>max){
                max=this.Vector[i];
               
            }
        }
        System.out.println("valor maximo "+ max); 
    }

    /**
     * @return the Vector
     */
    public int[] getVector() {
        return Vector;
    }

    /**
     * @param Vector the Vector to set
     */
    public void setVector(int[] Vector) {
        this.Vector = Vector;
    }
    
}
