import java.awt.Color;
import java.awt.Graphics;


public enum Nature {
	BARRE, 
	ESPACE;
	
	public void color(Graphics g) {
		Color c;
		if(this == Nature.BARRE) {
			c = Color.black;
		}else {
			c = Color.white;
		}
		g.setColor(c);
	}
}
