import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.text.Normalizer;
import java.util.Scanner;

public class Codeur {
	
	// Normalise la chaine passee en entree en supprimant les accents
	// et en mettant les caracteres en majuscule
	public static String normalize(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD)
				.replaceAll("[\u0300-\u036F]", "")
				.toUpperCase();
	}
	
	//ARGUMENT 1 : la clef du code cesar.
	//ARGUMENT 2 : "code" ou "decode" selon l'option voulue.
	//ARGUMENT 3 : le fichier d'entree a chiffre.
	//ARGUMENT 4 : le fichier de sortie chiffre.
	public static void main(String[] args) {
		try {
			Cesar c = new Cesar(Integer.parseInt(args[0]));
			Scanner sc = new Scanner(new File(args[2]));
			PrintStream ps = new PrintStream(new File(args[3]));
			
			if(args[1].equals("code")) {
				
				while(sc.hasNextLine()) {
					ps.println(c.code(normalize(sc.nextLine())));
				}
			}
			else if(args[1].equals("decode")) {
				while(sc.hasNextLine()) {
					ps.println(c.decode(normalize(sc.nextLine())));
				}
			}
			else {
				System.err.println("ERREUR ARGUMENTS 2");
			}
			
			sc.close();
		}
		catch(IOException e){
			System.err.println("ERREUR ARGUMENTS");
		}
	}
}
