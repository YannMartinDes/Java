public class InventoryException extends RuntimeException{
	
	private static final long serialVersionUID = -1989411644245405815L;
	private final Inventory<?> inventory;
	
	public InventoryException(Inventory<?> inv) {
		this.inventory = inv;
	}
	
	//Pour recupere l'inventaire qui a provoquer l'erreur.
	public Inventory<?> getInventory() {return this.inventory;}
}
