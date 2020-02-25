/**********************************************************
*Factory.java				Fecha de creacion: 24/02/2020 
*							Ultima fecha de modificacion: 24/02/2020 
*							
*Factory para instanciar los stacks
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
public class Factory{
	FactoryList factoryList = new FactoryList();

	/**
	//Pre: Haber elegido un stack 
	//Post: Intancia de tipo del stack seleccionado
	 * @param tipoStack  Tipo de stack a instanciar
	*/
	public iStack getStack(int tipoStack){
		if (tipoStack == 1) { //Es un vector
			stack = new Vectors<Integer>();
		} else if (tipoStack == 2) { //Es un arraylist
			stack = new ArrayLists<Integer>();
		} else if (tipoStack == 3) { //Es una lista
			stack = factoryList.getLista(tipoStack);
		}
		return stack; //Se devuelve el stack creado
	}
}