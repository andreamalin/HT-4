/**********************************************************
*ListaAbs.java			Fecha de creación: 23/02/2020
*							Última fecha de modificación: 
*							
*clase abstracta para las listas
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
public abstract class ListaAbs<E>implements iLista<E>  {

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public E removeLast() {
        return null;
    }


    public void addLast(E e) {

    }

}
