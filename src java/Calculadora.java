/**********************************************************
*Calculadora.java			Fecha de creacion: 01/01/2020
*							Ultima fecha de modificación: 01/01/2020
*							
*Lleva el control de las operaciones de la interfaz
*iCalculadora
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
public class Calculadora implements iCalculadora{
	/**
	 * @param operando1		Segundo numero a sumar/restar/dividir/multiplicar
	 * @param operando2     Primer numero a sumar/restar/dividir/multiplicar
	*/
	
	public int sumar(int operando2, int operando1){
		return operando2+operando1;
	}

	public int restar(int operando2, int operando1){
		return operando2-operando1;
	}

	public int dividir(int operando2, int operando1){
		return operando2/operando1;

	}

	public int multiplicar(int operando2, int operando1){
		return operando2*operando1;
	}
}
