
public class Main {
	public static void main(String[] args) {
		Expression expression = new Soustraction(new Addition(new Variable(1),new Variable(0)),new Constante(1));
		//Correspond a l'expression ((X0 + X1) - 1)
		System.out.println(expression.evalue(3,2)); // X0 = 3; X1 = 2	
		
		Expression expression2 = new Multiplication(
				new Division(
						new Constante(5), 
						new Variable(0))
				,new Addition(
						new Variable(1), 
						new Variable(0)));
		//Correspond a l'expression ((5 / X0) * ( X1 + X0))
		System.out.println(expression2.evalue(5,7)); // X0 = 5; X1 = 7	
		System.out.println(expression2.evalue(2,9)); // X0 = 2; X1 = 9	
	}
}
