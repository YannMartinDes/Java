
public class Constante implements Expression{
	private final double val;
	
	Constante(double val){
		this.val = val;
	}
	
	public double evalue(double... variables) {
		return this.val;
	}
}
