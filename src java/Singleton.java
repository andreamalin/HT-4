/**********************************************************
*Singleton.java				Fecha de creacion: 24/02/2020 
*							Ultima fecha de modificacion: 24/02/2020 
*							
*Se hace uso de una unica instancia de calculadora
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
public class Singleton{
	Calculadora calculadora = new Calculadora();

	//Post: Instancia de tipo calculadora
	public Calculadora getInstancia(){
		return calculadora;
	}
}