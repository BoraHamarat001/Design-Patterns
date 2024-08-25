package math.decoratorP;

public class Square extends AddOnDecorator {
	Calculation calculation;
	public Square(Calculation calculation) {
		this.calculation=calculation;
	}
	public double result() {
		return this.calculation.result()*this.calculation.result();
	}

}
