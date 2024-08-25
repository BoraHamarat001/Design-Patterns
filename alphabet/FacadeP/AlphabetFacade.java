package alphabet.FacadeP;

public class AlphabetFacade {
	A a;
	B b;

	public AlphabetFacade(A a,B b) {
		this.a=a;
		this.b=b;
	}
	public void countFromHead() {
		a.description();
		b.description();
	}

}
