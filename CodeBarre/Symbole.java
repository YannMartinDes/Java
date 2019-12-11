import java.awt.Graphics;

public class Symbole {
	private Nature n;
	private Epaisseur e;
	
	Symbole(Nature n, Epaisseur e){
		this.n = n;
		this.e = e;
	}
	
	public Epaisseur getE() {
		return this.e;
	}
	
	public void dessiner(Graphics g, int x, int y) {
		n.color(g);
		e.dessiner(g, x, y);
	}
}
