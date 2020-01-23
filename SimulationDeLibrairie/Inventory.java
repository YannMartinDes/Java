import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;


public class Inventory<E>{
	
	//La liste de livre est un dictionnaire. (table de hashage)
	private Hashtable<E, Integer> liste = new Hashtable<E,Integer>();

	public int get(E e) {
		if(liste.containsKey(e)) return liste.get(e);
		//Si il ne le contient pas on renvoie 0.
		return 0;
	}

	public ArrayList<E> getAll() {
		//On le transforme en set.
		Set<E> allObject = liste.keySet();
		//Puis en ArrayList
		ArrayList<E> resList = new ArrayList<E>(allObject);
		return resList;
	}

	public void add(E e,int n) {
		//Exception sur n negatif.
		if(n < 0) throw new IllegalArgumentException("ERROR : int n has negative value");

		int oldNumber = this.get(e);
		liste.put(e, oldNumber + n);
	}

	public void remove(E e, int n) {
		//Exception sur n negatif.
		if(n < 0) throw new IllegalArgumentException("ERROR : int n has negative value");

		int oldNumber = this.get(e);
		
		//Exception pour un resultat negatif.
		if((oldNumber - n) < 0 ) throw new InventoryException(this);

		if((oldNumber - n) == 0) {//Si la valeur est nulle on supprime la clef (pour getAll)
			liste.remove(e);
		}
		else { //Sinon on met a jour la valeur
			liste.put(e, oldNumber - n);
		}
	}

	// L'iterateur.
	public Iterator<Entry<E>> iterator() {
		return new InventoryIterator();
	}

	// La classe iterateur de l'inventaire.
	private class InventoryIterator implements Iterator<Entry<E>>{
		
		//On utilise un index pour hasNext.
		int index = 0;
		//On recupere l'arraylist de l'inventaire.
		ArrayList<E> Keys = getAll();
	
		@Override
		public Entry<E> next() {
			//Exception
			if (!hasNext()) throw new NoSuchElementException();
			
			E e = Keys.get(index);
			index++;
			//On retourne une entry.
			return new Entry<E>(e,get(e));
		}
		
		@Override
		public boolean hasNext() {
			//Si on n'a pas atteind la fin de la liste.
			return (index < Keys.size());
		}
	}
}
