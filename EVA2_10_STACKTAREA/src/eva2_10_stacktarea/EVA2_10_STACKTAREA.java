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
public class EVA2_10_STACKTAREA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
   MyStack myStack=new MyStack();
      myStack.add(100);
      myStack.add(200);
      myStack.add(300);
      myStack.add(400);
      myStack.add(500);
      myStack.printList();
      try {
         System.out.println("El Primer elemento de la fila es: " + myStack.peek());
      } catch (Exception ex) {
         ex.printStackTrace();
      }
      myStack.printList();
      try {
         System.out.println("El Segundo elemento eliminado es : " + myStack.poll());
      } catch (Exception ex) {
         ex.printStackTrace();
      }
      myStack.printList();
   }
   }
   

