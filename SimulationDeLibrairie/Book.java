
public class Book {
	/* FIELDS */
	private final String auteur;
	private final String titre;
	private final double prix;
	private final String ISBN;
	
	/* CONSTRUCTOR */
	public Book(String auteur, String titre, double prix, String ISBN){
		this.auteur = auteur;
		this.titre = titre;
		this.prix = prix;
		this.ISBN = ISBN;
	}

	/* GETTERS*/
	public String getAuteur() {
		return auteur;
	}

	public String getTitre() {
		return titre;
	}

	public double getPrix() {
		return prix;
	}

	public String getISBN() {
		return ISBN;
	}
	
	@Override
	public int hashCode() {
		//Le hashcode correspond au hashcode de son isbn.
		return this.ISBN.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		//Si l'objet est lui meme.
		if(this == obj) return true;
		
		//Si ce n'est pas un livre.
		if(!(obj instanceof Book)) return false;
		
		//Si l'isbn est le meme alors ils sont egaux.
		return this.ISBN.equals(((Book) obj).getISBN());
	}
	
	@Override
	public String toString() {
		return this.auteur+" "+this.titre+" "+this.prix+" "+this.ISBN;
	}
}
