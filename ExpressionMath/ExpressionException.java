
public class ExpressionException extends RuntimeException{
	
	private static final long serialVersionUID = -7858301457575102574L;
	private final Expression exp;
	
	ExpressionException(Expression exp){
		super();
		this.exp = exp;
	}
	
	public Expression getExp() {return this.exp;}
}
