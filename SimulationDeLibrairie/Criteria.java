import java.util.Comparator;


public enum Criteria {
	AUTHOR,
	TITLE,
	PRICE;

	// Criteria.AUHTOR.getComparator 
	// ordreCroissant vaut true si l'ordre est croissant.
	public Comparator<Book> getComparator(boolean ordreCroissant){
		switch(this) {
		case AUTHOR :
			return new SortByAuthor(ordreCroissant);
		case TITLE :
			return new SortByTitle(ordreCroissant);
		case PRICE :
			return new SortByPrice(ordreCroissant);
		default :
			throw new NullPointerException();
		}
	}

	// Comparateur par auteur.
	public class SortByAuthor implements Comparator<Book>{

		boolean ordreCroissant;

		public SortByAuthor(boolean ordreCroissant) {
			this.ordreCroissant = ordreCroissant;
		}
		@Override
		public int compare(Book o1, Book o2) {
			if(ordreCroissant) {
				return o1.getAuteur().compareTo(o2.getAuteur());
			}
			else {
				return o2.getAuteur().compareTo(o1.getAuteur());
			}
		}
	}
	
	// Comparateur par titre.
	public class SortByTitle implements Comparator<Book>{

		boolean ordreCroissant;

		public SortByTitle(boolean ordreCroissant) {
			this.ordreCroissant = ordreCroissant;
		}
		@Override
		public int compare(Book o1, Book o2) {
			if(ordreCroissant) {
				return o1.getTitre().compareTo(o2.getTitre());
			}
			else {
				return o2.getTitre().compareTo(o1.getTitre());
			}
		}
	}

	// Comparateur par prix.
	public class SortByPrice implements Comparator<Book>{

		boolean ordreCroissant;

		public SortByPrice(boolean ordreCroissant) {
			this.ordreCroissant = ordreCroissant;
		}
		@Override
		public int compare(Book o1, Book o2) {
			//On compare des doubles on ne peut pas faire :
			//return (int) o1.getPrix() - o2.getPrix()
			if(o1.getPrix() < o2.getPrix()) {
				if(ordreCroissant) {
					return -1;
				}else {
					return 1;
				}
			}
			if(o1.getPrix() > o2.getPrix()) {
				if(ordreCroissant) {
					return 1;
				}else {
					return -1;
				}
			}
			//Ils sont egaux.
			return 0;
		}
	}
}