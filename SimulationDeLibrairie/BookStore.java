import java.util.ArrayList;

public class BookStore {
	//Le stock de la librairie est aussi un inventaire.
	Inventory<Book> stock = new Inventory<Book>();
	
	
	public void restock(Inventory<Book> restock) {
		
		ArrayList<Book> books = restock.getAll();
		
		for(Book book : books) {
			stock.add(book, restock.get(book));
		}
	}
	
	public void sell(Inventory<Book> sell) {
		
		ArrayList<Book> books = sell.getAll();
		
		for(Book book : books) {
			stock.remove(book, sell.get(book));
		}
	}
	
	public int get(Book book) {
		return stock.get(book);
	}
	
	public ArrayList<Book> getAll() {
		return stock.getAll();
	}
}
