/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_fibonacci;

import java.util.Scanner;

/**
 *
 * @author ivned
 */
public class EVA2_5_FIBONACCI {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      
      int a= 0, b= 1, c, n;
      
      System.out.print("Ingresar Cantidad de elementos para la serie: ");
      n = teclado.nextInt();
      
      for (int i = 0; i < n; i++) {
         System.out.print("["  + a + "]" + "-");
        c = a + b;
        a = b;
        b = c;
         
      }
   }
}
