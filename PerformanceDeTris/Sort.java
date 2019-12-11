
public interface Sort {
	//L'interface Sort
	void sort(int[] t, int from, int to);
	
	default public void sort(int[] t) {
		// Cas de base sans from et to : on prend le tableau en entier. 
		sort(t,0,t.length);
	}
}
