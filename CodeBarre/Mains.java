import javax.swing.JFrame;


public class Mains {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // creation d’une fenetre graphique
		frame.setSize(800, 600); // taille de la fenetre
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// comportement lors de la fermeture
		frame.setLocationRelativeTo(null); // on centre la fenetre
		frame.getContentPane().add(new MyPanel("VOTRE MESSAGE")); // on ajoute le panneau
		frame.setVisible(true); // on rend la fenetre visible
	}
}


