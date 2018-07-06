/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectofrancogit;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class ProjectoFrancoGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random numerosAleatorios= new Random();
       int num;
       
       num=numerosAleatorios.nextInt(100);
       
        System.out.println("El numero al azar escogido es: "+num);
       
        System.out.println("Has adivinado el numero");
        System.out.println("Has ganado");
    }
    
}
