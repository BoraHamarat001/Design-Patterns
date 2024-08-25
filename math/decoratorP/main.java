package math.decoratorP;

public class main {

	public static void main(String[] args) {
		Calculation calc1=new Square(new Five());
		System.out.println(calc1.result());
		
		

	}

}
