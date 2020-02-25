/**********************************************************
*Stack.java				Fecha de creacion: 01/01/2020
*						Última fecha de modificacion: 24/02/2020
*							
*Clase abstracta que contiene las operaciones que puede ejecutar
*la calculadora haciendo uso de un arraylist o un vector
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
import java.util.ArrayList;

public abstract class Stack<E> implements iStack<E>{
	public abstract void push(E dato);
	public abstract E pop();
	public abstract E peek();
	public abstract int size();
	public abstract boolean empty();
}
