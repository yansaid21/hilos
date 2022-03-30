/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizadorhilos;

import clases.Hilo;

/**
 *
 * @author JEAN SAID
 */
public class OrganizadorHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector []={5,6,4,2,7,8,20,4};
        int vector1 []= new int [vector.length/2];
//        System.out.println(vector1.length);
        int vector2 []= new int [vector.length/2];
        for (int i = 0; i <vector.length/2 ; i++) {
            vector1[i]= vector[i];
//            System.out.println("vector1 "+vector1[i]);
            
        }
//        for (int j = 0; j < vector2.length; j++) {
//            System.out.println("aqui entra ");
int j=0;
        for(int i = (vector.length/2)+1; i <vector.length ; i++){
            vector2[j]= vector[i];
//            System.out.println(j+ " este es j");
//            System.out.println("vector2 "+vector2[j]);
//            System.out.println("vector inicial posicion i " + vector[i]);
            j++;
            
                        

        }    
//        }
        
        Hilo hilo1=new Hilo(vector1);
        Hilo hilo2=new Hilo(vector2);
        
        
        Thread proceso1=new Thread(hilo1);
        Thread proceso2=new Thread(hilo2);
        proceso1.start();
        proceso2.start();
    }
    
}
