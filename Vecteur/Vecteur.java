public class Vecteur {
	double[] vect;
	
	public Vecteur(double... vect) {
		 this.vect = vect;
	}
	public Vecteur(int nb,double[] vect2) {
		this.vect = new double[nb];
		for(int i=0;i < vect.length;i++) {
			vect[i] = 0;
		}
		for(int i=0;(i<vect.length) && (i<vect2.length); i++) {
			vect[i] = vect2[i];
		}
	}
	public double[] getVect() {
		return this.vect;
	}
	
	public String toString() {
		String res="";
		for(double el:vect) {
			res+=el+" ";
		}
		return res;
	}
	
	public Vecteur scalaire(double lambda) {
		double[] res = new double[vect.length];
		for(int i=0; i<vect.length;i++) {
			res[i] = vect[i]*lambda;
		}
		return new Vecteur(vect.length,res);
		
	}
	
	public Vecteur addVect(Vecteur v2) {
		double[] vect2 = v2.getVect();
		int max = Math.max(vect.length,vect2.length);
		double[] res = new double[max];
		
		for(int i=0; i<max;i++){
			if (i< vect.length && i<vect2.length) {
				res[i] = vect[i]+vect2[i];
			}else {
				if(i<vect.length) {
					res[i] = vect[i];
				}
				if(i<vect2.length) {
					res[i] = vect2[i];
				}
			}
		}
		return new Vecteur(max,res);
	}
	
	public double prodScal(Vecteur v2) {
		double[] vect2 = v2.getVect();
		int min = Math.min(vect.length,vect2.length);
		double res = 0;
		
		for(int i=0; i<min;i++){
			res += vect[i]*vect2[i];
			
		}
		return res;
	}
	
	public Vecteur sym() {
		double[] res = new double[vect.length];
		for(int i=vect.length-1,j=0;i>=0 && j< vect.length;i--,j++) {
			res[j] = vect[i];
		}
		return new Vecteur(vect.length,res);
	}
}