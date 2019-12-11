
public class OptimizedQuickSort implements Sort{
	
	public void sort(int[] t, int from, int to) {
		Sort s;
		if(t.length<=16) { 
			// Si la longueur du tableau est inférieur ou égal à 16 on utilise le tri par selection
			s = new SelectionSort();
			s.sort(t, from, to);
		}else {
			// Sinon on utilise le tri rapide. 
			s = new QuickSort();
			s.sort(t,from,to);
		}
	}
}
