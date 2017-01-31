/*Problema 2 de Fabricio Arturo Balboa Cavazos A01411541
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.t01.p2;
import java.util.Scanner;
/**
 *
 * @author FabricioArturo
 */
public class SPPT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Kb= new Scanner (System.in);
        Double base;
        Double altura;
        Double sub;
        Double per;
        System.out.println("Hola, bienvenido al calculo de perimetros y volumenes de rectangulos");
        System.out.println("Dime la base de tu rectangulo en centimetros");
        base = Kb.nextDouble();
        System.out.println("Ahora dime la altura de rectangulo en centimetros");
        altura = Kb.nextDouble();
        
        sub = (2*base+2*altura);
        per = (base*altura);      
        
                System.out.println("El perimetro de tu rectangulo es " + (sub) + " Cetimetros" + " y el area es de " + (per) + " Cetimetros cuadrados");
         
                 
        
            
                
       
        // TODO code application logic here
    }
    
}
