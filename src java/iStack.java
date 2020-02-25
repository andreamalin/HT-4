/**********************************************************
*iStack.java				Fecha de creacion: 01/01/2020
*							Ultima fecha de modificación: 24/02/2020
*							
*Interfaz que contiene los metodos que puede usar un Stack
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
public interface iStack<E>{
	/**
	 * @param dato  Dato a agregar
	*/
	public void push(E dato);
		//post: Se agrega un dato al final del vector
	public E pop();
		//pre: El tamano del vector debe de ser mayor a cero
		//post: Se elimina el ultimo dato agregado al vector
	public E peek();
		//pre: El tamano del vector debe de ser mayor a cero
		//post: Se obtiene el ultimo dato agregado a la lista
	public boolean empty();
		//post: Valor verdadero si la lista esta vacia
	public int size();
		//post: Se obtiene el tamano de la lista
}