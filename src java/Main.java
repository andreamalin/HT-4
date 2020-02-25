/**********************************************************
*Main.java					Fecha de creacion: 01/01/2020
*							Ultima fecha de modificación: 24/02/2020
*							
*Lleva el control de las operaciones a ejecutar
*Importa el paquete java.util y el java.io paa exepciones
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
import java.util.*;
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException{
		String txt = "", exepcion; //La operación se meterá a esta variable
		String[] operacion; //Operacion a leer
		int valor=0, operando1, operando2, stack_escogido; //Espacios para enteros
		boolean pedir = true; //Para revisar enteros

		Factory factory = new Factory();
		Singleton singleton = new Singleton();
		Calculadora calculadora = singleton.getInstancia();
		iStack<Integer> stackElegido;
		Scanner scan = new Scanner(System.in);


		//Se lee el txt
		try {
			Scanner r = new Scanner(new File("datos.txt")); 
			while (r.hasNextLine()) {
				txt += (r.nextLine()); //Mientras hayan lineas por leer se meten a la variable txt
			}
			operacion = txt.split(" "); //Operacion creada a partir del txt
			r.close();	
		} catch (Exception e) { //Se muestra la razon de error por la que no se encuentra el doc
			e.printStackTrace();
		}
		
		//Se ordenan los datos
		System.out.println("_______________________________________\n         ESCOJA EL TIPO DE STACK:          \n_______________________________________\n1. Vector\n2. ArrayList\n3. Listas\nElija la opcion: ");		
		//Se revisa que se ingrese un entero dentro del rango
		while(pedir){
			String stack = scan.next();
			try {
				stack_escogido = Integer.parseInt(stack);
				if (stack_escogido<=3 && stack_escogido>0) {
					pedir = false;
				}
				
			} catch (Exception e){
				System.out.println("Ingrese un numero dentro del rango");
			}
		}
		//Si se pidio una lista
		if (stack_escogido==3) {
			System.out.println("_______________________________________\n         ESCOJA EL TIPO DE LISTA:          \n_______________________________________\n4. Double List\n5. Sigle List\n6. Circular List\nElija la opcion: ");
			pedir = true; //Se vuelve a revisar que se ingrese un entero dentro del rango
			while(pedir){
				String lista = scan.next();
				try {
					stack_escogido =Integer.parseInt(lista);
					if (stack_escogido<=6 && stack_escogido>3) {
						pedir = false;
					}
				} catch (Exception e){
					System.out.println("Ingrese un numero dentro del rango");
				}
			}	
		} 

		stackElegido = factory.getStack(stack_escogido); //Se crea el tipo de Stack	

		//Se opera
		for(int i = 0; i < operacion.length; i++){
			try {
				valor = Integer.parseInt(operacion[i]);
				stackElegido.push(valor); //Si es entero se agrega

			} catch (Exception e){
				if (stackElegido.size() >= 2) { 
					//Se jalan los dos últimos operandos del stack
					operando2 = stackElegido.pop();
					operando1 = stackElegido.pop();
					
					//Se busca el operador
					switch(operacion[i]) {
						case "+":
					        valor = calculadora.sumar(operando2, operando1);
	                        break;
						case "-":
							valor = calculadora.restar(operando2, operando1);
							break;
						case "*":
							valor = calculadora.multiplicar(operando2, operando1);
							break;
						case "/":
							try {
								valor = calculadora.dividir(operando2, operando1);
							} catch (Exception o) {
							 	exepcion = "Division dentro de cero";
							}
							break;
						default:
							exepcion = "Error";
							break;								
					}
					stackElegido.push(valor);	
				} else { //No hay suficientes operandos
					exepcion = "No hay suficientes datos";
				}
			}
		}

		//Se muestra el resultado
		if (exepcion == null) {
			System.out.println("_______________________________________\n         El archivo no es legible de forma correcta          \n_______________________________________");	
			System.out.println(exepcion);	
		} else {
			System.out.println("_______________________________________\n          EL RESULTADO ES: " + stackElegido.peek() + "\n_______________________________________");
		}	
	}
}