
public class Variable implements Expression{
	private final int id;
	
	Variable(int id){
		if(id<0) {
			throw new IllegalArgumentException("(Illegal ID) variable negative: "+id);
		}
		this.id = id;
	}
	
	public double evalue(double... variables){
		if(id>= variables.length) {
			throw new VariableNonDefinie(this);
		}
		return variables[id];
	}
	
	public int getId() {return id;}
	
}
