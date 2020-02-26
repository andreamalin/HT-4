/**********************************************************
*Lista.java					Fecha de creación: 23/02/2020
*							Última fecha de modificación: 
*							
*clase abstracta para las listas
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
public abstract class Lista<E> implements iLista<E>, iStack<E>  {
    @Override
    public boolean empty(){
        if (size() == 0) {
            return true;
        } return false;
    }
}
