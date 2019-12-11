
public class QuickSort implements Sort {
	public void sort(int[] t, int from, int to) {
		// On appel quick sort avec le nouveau 'to'. 
		quickSort(t,from,to-1);
	}
	
	// L'algorithme de tri rapide.
	private void quickSort(int[] t, int first, int last) {
		if(first<last) {
			int pivot = (last-first)/2; // Choix du pivot 
			
			pivot = this.partitionner(t, first, last, pivot);
			// On trie les deux sous-tableaux.
			quickSort(t,first,pivot-1);
			quickSort(t,pivot+1,last);
		}
	}
	
	// La sous-fonction qui renvoie le nouveau pivot et partitionne les élément du tableau en deux.
	private int partitionner(int[] t,int first, int last, int pivot) {
		ArrayUtil.swap(t, pivot, last);
		int j = first;
		for(int i = first; i<last; i++) {
			if(t[i] <= t[last]) {
				ArrayUtil.swap(t, i, j);
				j+=1;
			}
		}
		ArrayUtil.swap(t, last, j);
		return j;
	}
}
