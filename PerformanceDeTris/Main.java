
public class Main {
	public static void main(String [] args) {
		
		Benchmark b = new Benchmark(); //On aurais pu mettre en static dans la classe Benchmark. 		
		int n = 1;
		
		// Les 3 algos de tri. 
		Sort selection = new SelectionSort();
		Sort bubble = new BubbleSort();
		Sort quick = new QuickSort();
		Sort quickOpti = new OptimizedQuickSort();
		
		System.out.println("Selection, bubble, quick and optimized quick sort (time for 1000000 instances)");
		
		//Comme suivant l'exemple: instances de 1 000 000 avec 7 taille differentes.
		for(int i=0; i<7;i++) {
			Instance inst = new Instance(1000000,n);
			System.out.println("Length = "+ n +" : " + b.getTime(selection, inst) +" ms, " + 
					b.getTime(bubble, inst)+" ms, "+ b.getTime(quick, inst) +" ms, " + b.getTime(quickOpti, inst)+" ms.");
			n *=2;
		}
	}
}
