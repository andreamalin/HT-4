import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**********************************************************
*pilatest.java				Fecha de creacion: 01/01/2020
*							Ultima fecha de modificacion: 24/02/2020
*							
*
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
class PilaTest {

	@Test
	public void test() {
		Calculadora prueba = new Calculadora();
		iStack<Integer> stack = new ArrayLists(); 
		
		String[] opc = { "5", "5", "+" };
		int num;
		int res=0;
		int val2, val1; //varibles para operar
		
		for (int i=0; i<opc.length; i++) {
			try {
				num =Integer.parseInt(opc[i]);
				stack.push(num);
			} catch (Exception e){
				//obtienen los dos ultimos numeros para la operacion
				val1 = stack.pop();
				val2 = stack.pop();
				
				switch(opc[i]){
				case "+":
					res = prueba.sumar(val2, val1);
					break;
			}
			stack.push(res); 
			} 
		}
		
		int resFinal = stack.peek();
		System.out.println(resFinal);
		assertEquals(20, resFinal);
	}
}
