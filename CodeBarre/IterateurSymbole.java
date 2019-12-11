
public class IterateurSymbole {
	private String chaine;
	private int current = 0;
	
	IterateurSymbole(String chaine){
		this.chaine = chaine;
	}
	
	public Symbole next() {
		Symbole s;
		
		if(current%2 == 0) {
			if(chaine.charAt(current) == '0') {
				s = new Symbole(Nature.BARRE, Epaisseur.ETROIT);
			}else {
				s = new Symbole(Nature.BARRE, Epaisseur.LARGE);
			}
		}else {
			if(chaine.charAt(current) == '0') {
				s = new Symbole(Nature.ESPACE, Epaisseur.ETROIT);
			}else {
				s = new Symbole(Nature.ESPACE, Epaisseur.LARGE);
			}
		}
		current += 1;
		return s;
	}
	
	public Boolean hasNext() {
		if(current >= chaine.length()) {
			return false;
		}else {
			return true;
		}
	}
}
