
public class ComplexeCartesien implements Complexe{
	private double x;
	private double y;
	
	ComplexeCartesien(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double reelle() {
		return x;
	}
	public double imaginaire() {
		return y;
	}
	public double module() {
		return Math.sqrt(x*x + y*y);
	}
	public double argument() {
		return Math.atan2(y,x);
	}
}
