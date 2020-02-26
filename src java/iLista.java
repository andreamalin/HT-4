/**********************************************************
*iLista.java			Fecha de creación: 23/02/2020
*						Última fecha de modificación: 25/02/2020
*							
*Interfaz de listas
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/

public interface iLista<E>{

   public E getLast();
   // pre: La lista no esta vacia
   // post: Se retorna el ultimo elemento

   public E removeLast();
   // pre: La lista no esta vacia
   // post: Se remueve el ultimo elemento de la lista
	/**
	 * @param valor  Dato a agregar
	*/
   public void addLast(E valor);
   // post: Se agrega un valor al final de la lista


}