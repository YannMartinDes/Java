import java.awt.Graphics;


public enum Epaisseur {
	LARGE (6),
	ETROIT (2);
	
	
	private int hauteur = 80;
	private final int ep;
	
	Epaisseur(int ep){
		this.ep = ep;
	}
	
	public int getEp() {
		return this.ep;
	}
	
	public void dessiner(Graphics g, int x, int y) {
		g.fillRect(x, y, ep, hauteur);
	}
	
}
