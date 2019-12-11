import java.awt.Graphics;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	
	private IterateurSymbole it;
	private static final long serialVersionUID = -3198872895980265304L;
	
	Code39 c = new Code39();
	
	public MyPanel(String msg) {
		this.it = new IterateurSymbole(c.stringToCode(msg));
	}
	
	protected void paintComponent(Graphics g) {
		int x = 20;
		int y = 20;
		
		while(it.hasNext()) {
			Symbole s = it.next();
			s.dessiner(g, x, y);
			x+= s.getE().getEp();
		}
	}
}
