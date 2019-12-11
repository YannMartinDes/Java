public class Vecteur2D {
	
	private double x,y;
	
	public Vecteur2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double Getx() {
		return this.x;
	}
	
	public double Gety() {
		return this.y;
	}
	
	public Vecteur2D scalaire(double lambda) {
		Vecteur2D res = new Vecteur2D(lambda*x,lambda*y);
		return res;
	}
	
	public Vecteur2D addVect(Vecteur2D v2) {
		Vecteur2D res = new Vecteur2D(this.x+v2.Getx(),this.y+v2.Gety());
		return res;
	}
	
	public double prodScal(Vecteur2D v2) {
		return this.x*v2.Getx() + this.y*v2.Gety();
	}
	
	public Vecteur2D sym() {
		Vecteur2D res = new Vecteur2D(this.y,this.x);
		return res;
	}
	
	public String toString() {
		return x +" "+ y;
	}
}
