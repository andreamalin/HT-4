/**********************************************************
*Vector.java				Fecha de creacion: 24/02/2020
*							Ultima fecha de modificacion: 24/02/2020
*							
*Interfaz que contiene los metodos que puede usar un Vector
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
import java.util.*;

public class Vectors<E> extends Stack<E>{
	/*
	CODIGO ADAPTADO DE: ADT Stack en Java
	Extraido de: https://uvg.instructure.com/courses/13715/pages/adt-stack-en-java?module_item_id=195245
	*/
	protected Vector<E> expresion = new Vector<E>();

	/**
	 * @param dato  Dato a agregar
	*/
	//Post:		Agrega un dato al comienzo del vector
	public void push(E dato){
		expresion.add(dato);
	}
	//Post:		Remueve el ultimo dato del vector
	public E pop(){
		return expresion.remove(expresion.size()-1);
	}
	//Post:		Retorna el ultimo dato del vector
	public E peek(){
		return expresion.get(size()-1);
	}
	//Post:		Retorna el entero del tamano del vector
	public int size(){
		return expresion.size();
	}

}