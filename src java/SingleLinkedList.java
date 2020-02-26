/**********************************************************
*SingleLinkedList<E>.java			Fecha de creación: 23/02/2020
*							        Última fecha de modificación: 25/02/2020
*							
*
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
public class SingleLinkedList<E> extends Lista<E> {
    /**
    / Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Capitulo 9.
    */
    protected int tamano; 
    protected Node<E> cabeza; 

    public SingleLinkedList(){
        cabeza = null;
        tamano = 0;
    }
   
    public int size() {
        return tamano;
    }
    /**
     * @param valor  Dato a agregar
    */  
    public void addFirst(E valor){
        cabeza = new Node<E>(valor, cabeza);
        tamano++;
    }
      
    public E removeFirst() {
        Node<E> temporal = cabeza;
        cabeza = cabeza.siguiente(); 
        tamano--;
        return temporal.valor();
    }
  
    public E getFirst(){
        return cabeza.valor();
    }
    /**
     * @param valor  Dato a agregar
    */ 
    @Override
    public void addLast(E valor){
        Node<E> temporal = new Node<E>(valor,null);
        if (cabeza != null) {
         Node<E> siguiente = cabeza;
            while (siguiente.siguiente() != null) {
                siguiente = siguiente.siguiente();
            }

            siguiente.setSiguiente(temporal);

        } else {
            cabeza = temporal;
        }

        tamano++;
   }

   @Override
    public E removeLast(){
        Node<E> siguiente = cabeza;
        Node<E> anterior = null;
        
        while (siguiente.siguiente() != null){
            anterior = siguiente;
            siguiente = siguiente.siguiente();
        }
        if (anterior == null){
            cabeza = null;
        } else {
            anterior.setSiguiente(null);
        }

        tamano--;
        return siguiente.valor();
    }

    @Override
    public E getLast(){
        Node<E> siguiente = cabeza;
        Node<E> anterior = null;
        
        while (siguiente.siguiente() != null){
            anterior = siguiente;
            siguiente = siguiente.siguiente();
        }
        if (anterior == null){
            cabeza = null;
        } 
        return siguiente.valor();
    } 


    @Override
    public void push(E dato){
        addLast(dato);
    }
    @Override
    public E pop(){
        return removeLast();
    }
    @Override
    public E peek(){
        return getLast();
    }
}