import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**********************************************************
*ListaTestCorrecta.java					Fecha de creación: 23/02/2020
*							Última fecha de modificación: 
*							
*Prueba Unitaria
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
class ListaTestCorrecta {

	CircularLinkedList<Integer> test = new CircularLinkedList<Integer>();
	@Test
	public void add() {
        test.addFirst(15);
        test.addFirst(10);
        test.addFirst(20);

        int hola = test.removeLast();
        System.out.println(hola);
        assertEquals(hola, 15);
    }

}
