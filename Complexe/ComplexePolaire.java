public class ComplexePolaire implements Complexe {
	private double module;
	private double arg;
	
	ComplexePolaire(double mod, double arg){
		this.module = mod;
		this.arg = arg;
	}
	
	public double reelle() {
		return (module * Math.cos(arg));
	}
	public double imaginaire() {
		return (module * Math.sin(arg));
	}
	public double module() {
		return this.module;
	}
	public double argument() {
		return this.arg;
	}
}
