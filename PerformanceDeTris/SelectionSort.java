
public class SelectionSort implements Sort{
	
	// l'algorithme de tri par selection
	public void sort(int[] t, int from, int to){
		for(int i = from; i<to-1; i++) {
			int min = i;
			for(int j = i+1; j<to; j++) {
				if(t[j] < t[min]) {
					min = j;
				}
			}
			if(min != i) {
				ArrayUtil.swap(t, i, min);
			}		
		}
	}
}
