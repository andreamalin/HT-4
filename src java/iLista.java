/**********************************************************
*iLista.java			Fecha de creación: 23/02/2020
*							Última fecha de modificación: 
*							
*Interfaz de listas
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/

public interface iLista<E> {


    public void addFirst(E e);

    public E removeFirst();

    public int size();

    public boolean isEmpty();

}

