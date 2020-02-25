/**********************************************************
*FactoryList.java			Fecha de creacion: 24/02/2020 
*							Ultima fecha de modificacion: 24/02/2020 
*							
*Factory list para insntaciar el tipo de lista
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
public class FactoryList{
	/**
	//Pre: Haber elegido stack de tipo lista
	//Post: Intancia de tipo de lista seleccionada
	 * @param lista  Tipo de lista a instanciar
	*/
	public iStack getLista(int lista){
		if (lista == 4) { //Es Double
			return new DoubleLinkedList<Integer>();
		} else if (lista == 5) { //Es Single
			return new SingleLinkedList<Integer>();
		} else {
			return new CircularLinkedList<Integer>();
		}
	}
}