/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_stacktarea;

/**
 *
 * @author ivned
 */
public class MyStack extends Lista {
   public int peek() throws Exception{//regresa el valor del elemento a la lista 
return get(0);      
   }
   public int poll() throws Exception{//regresa y elimina el elemento al inicio de la lista
      //GUARDAR EL VALOR
      int iVal= get(1);
      //ELIMINAMOS EL VALOR 
      deleteAt(1);
      //ENVIAMOS EL VALOR
      return iVal;
   }
   
}
