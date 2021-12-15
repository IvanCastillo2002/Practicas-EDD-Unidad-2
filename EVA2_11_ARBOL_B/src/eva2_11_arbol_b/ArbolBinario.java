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
public class ArbolBinario {
   private Nodo root;

   public ArbolBinario() {
   this.root=null;//Arbol Vacio
   }
  //A PARTIR DE AQUI TODO ES RECURSIVO
   //AGREGAR UN NODO
   public void add(int valor){
      Nodo nuevo=new Nodo(valor);
      //VERIFICAMOS SI NO HAY NODOS EN LA LISTA
      if(root==null){//ARBOL VACIO
         root=nuevo;
      }else{//HAY NODOS
         //METODO RECURSIVO PARA AGREGAR NODOS
         addRecu(root, nuevo);
         
      }
   }
   //metodo recursivo (nodo actual, nodo nuevo)
   private void addRecu(Nodo actual, Nodo nuevo){
      //VERIFICAR EL LADO QUE VA EL NODO
      if(nuevo.getDato() < actual.getDato()){//IZQ: VALOR NUEVO MENOR QUE NODO ACTUAL
if(actual.getIzquierda() == null){//TENEMOS ESPACIO, AQUI INSERTAMOS EL NODO NUEVO
      actual.setIzquierda(nuevo);
}else{//Llamar de nuevo al metodo recursivo, pero moviendome a izq
   addRecu(actual.getIzquierda(), nuevo);
}
   }else if(nuevo.getDato() > actual.getDato()){//DERECHA
      if(actual.getDerecha()== null){//TENEMOS ESPACIO, AQUI INSERTAMOS EL NODO NUEVO
      actual.setDerecha(nuevo);
}else{//Llamar de nuevo al metodo recursivo, pero moviendome a derecha
   addRecu(actual.getDerecha(), nuevo);
}
   }else{//valor igual al actual
         System.out.println("El valor ya existe en el arbol");  
   }
}
   //IMPRIMIR NODOS DEL ARBOL
   public void printPreOrder(){
      preOrder(root);//Llama al metodo recursivo preorder
   }
   private void preOrder (Nodo actual){
      if(actual !=null){
         System.out.print("[" + actual.getDato() + "]");//visit nodo
     preOrder(actual.getIzquierda());// travers left subtree
     preOrder(actual.getDerecha()); //travers right subtree
      
      }
   }
   //POST ORDER
   public void printPostOrder(){
      postOrder(root);//Llama al metodo recursivo preorder
   }
   private void postOrder (Nodo actual){
      if(actual !=null){
       
     postOrder(actual.getIzquierda());// travers left subtree
     postOrder(actual.getDerecha()); //travers right subtree
     System.out.print("[" + actual.getDato() + "]");//visit nodo
      }
   }
   //IN ORDER
   public void printInOrder(){
      inOrder(root);//Llama al metodo recursivo preorder
   }
   private void inOrder (Nodo actual){
      if(actual !=null){
         System.out.print("[" + actual.getDato() + "]");//visit nodo
     inOrder(actual.getIzquierda());// travers left subtree
     inOrder(actual.getDerecha()); //travers right subtree
      
      }
   }
   
}