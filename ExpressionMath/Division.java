
public class Division extends Operation{
	
	Division(Expression fg, Expression fd){
		super(fg,fd);
	}
	
	public double calcule(double vfg,double vfd) {
		if(vfd == 0) {
			throw new DivisionParZero(this);
		}
		return vfg / vfd;
	}
}
