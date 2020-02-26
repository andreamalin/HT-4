/**********************************************************
*DoubleLinkedList<E>.java			Fecha de creación: 23/02/2020
*						            Última fecha de modificación: 25/02/2020
*							
*
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
    /**
    / Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Capitulo 9.
    */
public class DoubleLinkedList<E> extends Lista<E>{
    protected int tamano;
    protected DoubleNode<E> cabeza;
    protected DoubleNode<E> cola;

    public DoubleLinkedList(){
       cabeza = null;
       cola = null;
       tamano = 0;
    }

  /**
   * @param valor  Dato a agregar
  */
    public void addFirst(E valor){
       cabeza = new DoubleNode<E>(valor, cabeza, null);
       // fix cola, if necessary
       if (cola == null){
        cola = cabeza;
        tamano++;
      }
    }

    /**
     * @param valor  Dato a agregar
    */
    @Override
    public void addLast(E valor)
    // pre: valor is not null
    // post: adds new valor to cola of list
    {
       // construct new Valor
       cola = new DoubleNode<E>(valor, null, cola);
       // fix up cabeza
       if (cabeza == null) cabeza = cola;
       tamano++;
    }

    @Override
    public E removeLast(){
       DoubleNode<E> temporal = cola;
       cola = cola.anterior();
       if (cola == null) {
           cabeza = null;
       } else {
           cola.setSiguiente(null);
       }
       tamano--;

       return temporal.valor();
    }

    public int size(){
      return tamano;
    }

    @Override
    public E getLast(){
        return cola.valor();
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