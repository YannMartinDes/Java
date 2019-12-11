
public interface Complexe {
	double reelle();
	double imaginaire();
	double module();
	double argument();
	
	default public Complexe add(Complexe c2) { //Addition de c1 + c2 avec la representation cartésienne.
		double reelle = this.reelle() + c2.reelle();
		double imaginaire = this.imaginaire() + c2.imaginaire();
		
		return(new ComplexeCartesien(reelle,imaginaire));
	}
	
	default public Complexe sub(Complexe c2) {//Soustraction de c1 + c2 avec la representation cartésienne.
		double reelle = this.reelle() - c2.reelle();
		double imaginaire = this.imaginaire() - c2.imaginaire();
		
		return(new ComplexeCartesien(reelle,imaginaire));
	}
	
	default public Complexe mul(Complexe c2) {//Multiplication de c1 + c2 avec la representation cartésienne.
		double reelle = (this.reelle()*c2.reelle() - this.imaginaire()*c2.imaginaire());
		double imaginaire = (this.reelle()*c2.imaginaire() + this.imaginaire()*c2.reelle());
		
		return(new ComplexeCartesien(reelle,imaginaire));
	}
	
	default public Complexe div(Complexe c2) {//Division de c1 + c2 avec la representation cartésienne.
		// Le dénominateur de la division a'^2 + b'^2.
		double denominateur = (c2.reelle()*c2.reelle() + c2.imaginaire()*c2.imaginaire());
		
		double reelle = (this.reelle()*c2.reelle() + this.imaginaire()*c2.imaginaire()) / denominateur;
		double imaginaire = (this.imaginaire()*c2.reelle() - this.reelle()*c2.imaginaire()) / denominateur;
		
		return(new ComplexeCartesien(reelle,imaginaire));
	}
}