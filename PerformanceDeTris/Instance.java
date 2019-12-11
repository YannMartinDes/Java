
public class Instance {
	public int [][] tabInstance;
	
	// Constructeur de Instance
	public Instance(int number, int length) {
		
		tabInstance = new int[number][length];
		
		for(int i=0; i <number; i++) {
			tabInstance[i] = ArrayUtil.getRandomArray(length);
		}
	}
	
	public int[][] get(){
		int[][] tabCopy = new int[this.tabInstance.length][];
		
		for(int i=0;i<this.tabInstance.length;i++) {
			// On récupère l'adresse du tableau copié. 
			tabCopy[i] = ArrayUtil.copyTab(tabInstance[i]);
		}
		return tabCopy;
	}
}
