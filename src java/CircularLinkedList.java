/**********************************************************
*CircularLinkedList<E>.java			Fecha de creación: 23/02/2020
*							        Última fecha de modificación: 25/02/2020
*							
*
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
public class CircularLinkedList<E> extends Lista<E>{
    /**
    / Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Capitulo 9.
    */
    protected Node<E> cola; 
    protected int tamano;

    public CircularLinkedList(){
       cola = null;
       tamano = 0;
    }
      /**
       * @param valor  Dato a agregar
      */
    public void addFirst(E valor){
       Node<E> temporal = new Node<E>(valor);
       if (cola == null) { // first valor added
           cola = temporal;
           cola.setSiguiente(cola);
       } else { // Valor exists in list
           temporal.setSiguiente(cola.siguiente());
           cola.setSiguiente(temporal);
       }
       tamano++;
    }
    /**
       * @param valor  Dato a agregar
    */
    @Override
    public void addLast(E valor){
       addFirst(valor);
       cola = cola.siguiente();
    }
    @Override
    public E removeLast() {
       Node<E> actual = cola;
       while (actual.siguiente() != cola) {
           actual = actual.siguiente();
       }
       Node<E> temporal = cola;
       if (actual == cola) {
           cola = null;
       } else {
           actual.setSiguiente(cola.siguiente());
           cola = actual;
       }
       tamano--;
       return temporal.valor();
    }

    public int size(){
        return tamano;
    }
    @Override
    public E getLast(){
       Node<E> actual = cola;
       while (actual.siguiente() != cola) {
           actual = actual.siguiente();
       }
       Node<E> temporal = cola;
       if (actual == cola) {

       } else {
           actual.setSiguiente(cola.siguiente());
           cola = actual;
       }
       return temporal.valor();
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