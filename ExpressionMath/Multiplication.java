
public class Multiplication extends Operation{
	
	Multiplication(Expression fg, Expression fd){
		super(fg,fd);
	}
	
	public double calcule(double vfg,double vfd) {
		return vfg * vfd;
	}
}
