
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
public class DoubleNode<E>{
    protected E data;
    protected DoubleNode<E> siguienteValor;
    protected DoubleNode<E> anteriorValor;
    /**
     * @param v  Valor
     * @param siguiente siguiente valor a referenciar
     * @param anterior anterior valor a referenciar
    */  
    public DoubleNode(E v, DoubleNode<E> siguiente, DoubleNode<E> anterior){
        data = v;
        siguienteValor = siguiente;
        if (siguienteValor != null)
            siguienteValor.anteriorValor = this;
        anteriorValor = anterior;
        if (anteriorValor != null)
            anteriorValor.siguienteValor = this;
    }
    /**
     * @param v  Dato a agregar
    */  
    // post: Constructor
    public DoubleNode(E v){
        this(v,null,null);
    }
    // post: Se referencia el valor anterior
    public DoubleNode<E> anterior(){
        return anteriorValor;
    }
    /**
     * @param e  Dato siguiente a referenciar
    */  
    // post: Se coloca el siguiente valor
    public DoubleNode<E> setSiguiente(DoubleNode<E> e){
        return siguienteValor;
    }

    public E valor()
   // post: Se retorna el valor
    {
        return data;
    }
}