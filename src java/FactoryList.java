public class FactoryList{
	public iStack getLista(int lista){
		if (lista == 4) { //Es Double
			return new DoubleLinkedList<Integer>();
		} else if (lista == 5) { //Es Single
			return new SingleLinkedList<Integer>();
		} else {
			return new CircularLinkedList<Integer>();
		}
	}
}