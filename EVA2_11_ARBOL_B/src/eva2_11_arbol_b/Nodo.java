/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arbol_b;

/**
 *
 * @author ivned
 */
public class Nodo {
   private int dato;
   private Nodo derecha;
   private Nodo izquierda;
   
   //CONSTRUCTORES  
   public Nodo() {//default
       this.derecha = null;
       this.izquierda=null;
   }
   public Nodo(int dato){
      this.dato=dato;
      this.derecha=null;
      this.izquierda=null;
   } 
//METODOS GET Y SET  
   public int getDato( ) {
      return dato;
   }
   public void setDato(int dato) {
      this.dato = dato;
   }

   public Nodo getDerecha() {
      return derecha;
   }

   public void setDerecha(Nodo derecha) {
      this.derecha = derecha;
   }

   public Nodo getIzquierda() {
      return izquierda;
   }

   public void setIzquierda(Nodo izquierda) {
      this.izquierda = izquierda;
   }
   
   
}
