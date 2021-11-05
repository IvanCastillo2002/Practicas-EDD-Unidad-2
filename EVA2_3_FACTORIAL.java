/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_factorial;

/**
 *
 * @author ivned
 */
public class EVA2_3_FACTORIAL {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      System.out.println("Factorial de 5 = " + factorial(5));
   }
   public static int factorial(int iVal){//factorial usando recursividad
      if(iVal==0)//detenemos la recursividad
         return 1;
      else
         return iVal * factorial(iVal - 1);
   }
   public static int factorialFor (int iVal){
      int iTemp=1;
      for (int i = iVal; i > 0; i--) {
         iTemp=iTemp * i;
         
      }
  return iTemp;
   }
   
}
