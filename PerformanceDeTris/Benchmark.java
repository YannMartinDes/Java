
public class Benchmark {
	
	// Renvoie le temps en milliseconde que met un algorithme de tri algo pour trier une instance inst. 
	public long getTime(Sort algo, Instance inst) {
		int[][] t = inst.get(); 
		// On copie le tableau avant de commencer le tri (cad il n'est pas compté dans le temps d'execution)
		long t0 = System.currentTimeMillis();
		for(int i=0 ;i<t.length; i++) {
			algo.sort(t[i]);
		}
		long t1 = System.currentTimeMillis();
		return (t1 - t0);

	}
}
