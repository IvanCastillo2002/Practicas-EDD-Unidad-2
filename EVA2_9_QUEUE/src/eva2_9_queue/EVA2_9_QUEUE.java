/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_queue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ivned
 */
public class EVA2_9_QUEUE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      MyQueue myQueue=new MyQueue();
      myQueue.add(100);
      myQueue.add(200);
      myQueue.add(300);
      myQueue.add(400);
      myQueue.add(500);
      myQueue.printList ();
      try {
         System.out.println("El Primer elemento de la fila es: " + myQueue.peek());
      } catch (Exception ex) {
         ex.printStackTrace();
      }
      myQueue.printList();
      try {
         System.out.println("El Primer elemento eliminado es : " + myQueue.poll());
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
   
}
