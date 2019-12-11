
public abstract class Operation implements Expression {
	Expression fg; 
	Expression fd;
	
	Operation(Expression fg, Expression fd){
		this.fg = fg;
		this.fd = fd;
	}
	
	abstract double calcule(double vfg, double vfd);
	
	public double evalue(double... variables) {
		double vfg = fg.evalue(variables);
		double vfd = fd.evalue(variables);
		
		return calcule(vfg,vfd);
	}
}
