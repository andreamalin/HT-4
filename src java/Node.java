/**********************************************************
*Node<E>.java                Fecha de creación: 23/02/2020
*                            Última fecha de modificación: 25/02/2020
*                    
*
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
    /**
    / Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Capitulo 9.
    */
public class Node<E>{
   protected E data; 
   protected Node<E> siguienteValor; 
    /**
    * @param v  valor a colocar
    * @param siguiente  siguiente valor en la lista
    */ 
   public Node(E v, Node<E> siguiente)
   // pre: tener un valor v y una referencia al siguiente
   // post: es la nueva cabeza de la lista
   {
       data = v;
       siguienteValor = siguiente;
   }
    /**
    * @param valor  valor a colocar
    */
   public Node(E v)
   // post: Se construye una lista con valor v
   {
      this(v,null);
   }

   public Node<E> siguiente()
   // post: Retorna el siguiente valor en la lista
   {
      return siguienteValor;
   }
    /**
    * @param siguiente  siguiente valor en la lista
    */ 
   public void setSiguiente(Node<E> siguiente)
   // post: Se referencia el siguiente valor
   {
      siguienteValor = siguiente;
   }

   public E valor()
   // post: Se retorna el valor
   {
      return data;
   }
    /**
    * @param valor  valor a colocar
    */ 
   public void setValor(E valor)
   // post: Se coloca el valor
   {
      data = valor;
   }
}