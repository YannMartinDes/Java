

public class BubbleSort implements Sort{
	
	//Le tri a bulle d'un tableau t de from à to. 
	public void sort(int[] t, int from, int to){
		
		for(int i = to-1; i>from; i--) {
			
			boolean tabTrie = true;
			
			for(int j = from; j<i; j++) {
				if(t[j+1]<t[j]) {
					ArrayUtil.swap(t, j+1, j);
					tabTrie = false;
				}
			}
			if(tabTrie) { // Permet de ne pas continuer si il est déjà trié. 
				return;
			}
		}
	}
	
}