import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**********************************************************
*Calcutest.java					Fecha de creación: 23/02/2020
*							Última fecha de modificación: 
*							
*Prueba Unitaria
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
class CalcuTest {

	@Test
	void test() {
		Calculadora prueba = new Calculadora();
		
		int val = 10;
		int val2 = 15;
		
		int respuesta = prueba.multiplicar(val2, val); 
		
		assertEquals(140, respuesta);
	}

}
