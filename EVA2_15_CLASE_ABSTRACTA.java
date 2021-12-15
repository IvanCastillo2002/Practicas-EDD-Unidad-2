/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_clase_abstracta;

/**
 *
 * @author ivned
 */
public class EVA2_15_CLASE_ABSTRACTA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Prueba prueba = new Prueba() {};
      prueba.algo();
   }
   
}
abstract class Prueba{
   
   
   public void d(){
      
   }

   void algo() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
}
interface Algo{
   public void a();
   public int b();
   public boolean c();
   
   
}
