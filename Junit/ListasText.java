import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**********************************************************
*ListaTest.java					Fecha de creación: 23/02/2020
*							Última fecha de modificación: 
*							
*Prueba Unitaria
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
class ListasText {
	CircularLinkedList<Integer> test = new CircularLinkedList<Integer>();
	@Test
	public void add() {
        test.addFirst(5);
        test.addFirst(21);
        test.addFirst(30);

        int hola = test.removeLast();
        System.out.println(hola);
        assertEquals(hola, 41);
    }

}
