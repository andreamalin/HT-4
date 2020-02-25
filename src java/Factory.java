public class Factory{
	FactoryList factoryList = new FactoryList();
	iStack<Integer> stack;

	public iStack<Integer> getStack(int tipoStack){
		if (tipoStack == 1) { //Es un vector
			stack = new Vector<Integer>();
		} else if (tipoStack == 2) { //Es un arraylist
			stack = new ArrayList<Integer>();
		} else if (tipoStack == 3) { //Es una lista
			stack = factoryList.getLista(tipoStack);
		}
		return stack; //Se devuelve el stack creado
	}
}