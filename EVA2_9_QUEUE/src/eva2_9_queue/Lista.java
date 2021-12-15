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
public class Lista {//Lista Simplemente Enlazada(LINKED LIST)
   private Nodo inicio;//ACCESO A MI LISTA, PUNTO DE PARTIDA
   private Nodo fin;
   private int tama;//contador de nodos  
   public Lista(){
      inicio= null;//LISTA VACIA
      fin = null;
      tama = 0;  
   }
   //AGREGAR NODOS 
   public void add(int valor){//O(1)
      Nodo nuevo= new Nodo(valor);
      //Hay Nodos en la lista?
      if(inicio==null){//Lista Vacia
         inicio=nuevo;//conectamos el primer nodo a la lista
         fin=nuevo;
      }else{//Lista con Nodos
         //Hay que movernos al final de la lista
         //Usando Temp, Nodo por Nodo hasta llegar al final
       /*Nodo temp= inicio; //aqui empezamos
         //WHILE
         while (temp.getSiguiente() !=null) {//Mientras Temp! = NULL Nos vamos a mover             
            temp= temp.getSiguiente();//mover a temp al siguiente nodo 
        }
        temp.setSiguiente(nuevo);//conectamos al final de la lista al nuevo modo*/
       //agregar el nodo al final 
      fin.setSiguiente(nuevo);
      fin= nuevo;//Nos movemos al final de la lista
      }
      tama++;
   }
   //IMPRIMIR LA LISTA
   public void printList(){
      Nodo temp = inicio;//aqui empezamos
         //WHILE
         while (temp != null) {//Mientras Temp! = NULL Nos vamos a mover             
             System.out.print(temp.getDato() + "  -  ");
            temp = temp.getSiguiente();//mover a temp al siguiente nodo 
         }    
         System.out.println("");
   }
   //BORRAR LA LISTA
   public void clear(){//borramos todos los nodos de la lista
      inicio=null;
      fin=null;
      tama = 0;
   }
   //CONTAR LOS NODOS
   public int length(){ //O(1)
      /*int iCont= 0;//O(N)
       Nodo temp = inicio;//aqui empezamos
         //WHILE
         while (temp !=null) {//Mientras Temp! = NULL Nos vamos a mover             
          iCont++;
            temp= temp.getSiguiente();//mover a temp al siguiente nodo      
   }*/
         //return iCont;
         return tama;
}
   //LA LISTA ESTA VACIA: TRUE, CON NODOS: FALSE
   public boolean isEmpty(){
      if(inicio==null)
        return true;
      else
         return false;
   }
 //RECUPERAR UN VALOR DE LA LISTA
   public int get(int pos) throws Exception {
      //VERIFICACION     
      if(isEmpty()){//LISTA VACIA 
         throw new Exception("No hay valores almacenados en la lista!!");
      }else{//POSICION QUE NO EXISTA: POSICION NEGATIVA O QUE NOS PASEMOS
      //pos tiene que estar entre cero y N - 1 --> N es el tamaño (length)
      if((pos < 0) || (pos >= length())) //si pos es menor a 0 o poses mayor o igual a N
      throw new Exception("El valor " + pos + " no es una posicion valida en la lista!!");
         }
      Nodo temp= inicio;
      for (int i = 0; i < pos; i++) {
         temp=temp.getSiguiente();// mover a temp
      }
      return temp.getDato();
   }
 
   private void insertAtBeginning(Nodo nuevo){
      nuevo.setSiguiente(inicio);//PRIMERO CONECTAMOS EL NUEVO NODO A LA LISTA
      inicio = nuevo;                   //CONECTAR LA LISTA AL NUEVO NODO
   }
   public void insertAt(int pos, int valor){  
      Nodo nuevo = new Nodo(valor);
       //VALIDAR
       //SITUACIONES:     
       if(pos==0){//INSERTAR AL INICIO
          insertAtBeginning(nuevo); 
       }
       else{//CUALQUIER OTRO CASO
          //MOVERNOS AL NODO PREVIO DE LA POSICION
         Nodo temp = inicio;   
      for (int i = 0; i < (pos - 1); i++) {
        temp=temp.getSiguiente();//mover a temp al siguiente nodo
      } 
        //FALTA RECONECTAR
        //primero conectamos al nuevo nodo
        nuevo.setSiguiente(temp.getSiguiente());
         //CONECTAMOS LA LISTA AL NUEVO NODO
         temp.setSiguiente(nuevo);
       }
       tama ++; 
   }
   public void deleteAt(int pos){//O(N)
      int iTamaLista=length();//obtengo el tamaño de la lista
      //VALIDAR
      if(iTamaLista == 1){
         clear();
      }else{
      //SITUACIONES: 
      if(pos ==0){//borrar un nodo al inicio
     inicio=inicio.getSiguiente();
      }
      else{//CUALQUIER OTRO CASO
         //movernos al nodo previo a la posicion 
         Nodo temp=inicio;
         for (int i = 0; i < (pos - 1); i++) {
            temp=temp.getSiguiente();
         }
         //FALTA RECONECTAR
         temp.setSiguiente(temp.getSiguiente().getSiguiente());
     if(pos ==(iTamaLista - 1));//verifico si es el ultimo valor de la fila
      fin = temp;
      }
      tama--;
   }
}
}
