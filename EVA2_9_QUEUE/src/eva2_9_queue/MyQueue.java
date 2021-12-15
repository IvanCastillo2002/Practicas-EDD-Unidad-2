/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_queue;

/**
 *
 * @author ivned
 */
public class MyQueue extends Lista{
   //COMO LA FILA DEL SUPERMERCADO
   //LOS ELEMENTOS SE AGREGAN AL FINAL DE LA LISTA
   //METODO ADD DE LA LISTA --> SIN CAMBIOS
   //SOLO PODEMOS ACCEDER A LOS ELEMENTOS AL INICIO DE LA LISTA
   public int peek() throws Exception{//regresa el valor del elemento a la lista 
return get(0);      
   }
   
   public int poll() throws Exception{//regresa y elimina el elemento al inicio de la lista
      //GUARDAR EL VALOR
      int iVal= get(0);
      //ELIMINAMOS EL VALOR 
      deleteAt(0);
      //ENVIAMOS EL VALOR
      return iVal;
   }
   
}
