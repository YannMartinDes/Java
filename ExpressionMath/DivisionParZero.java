
public class DivisionParZero extends ExpressionException{
	private static final long serialVersionUID = 2413621308415196807L;

	DivisionParZero(Expression exp){
		super(exp);
	}
}
