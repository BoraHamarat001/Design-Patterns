package alphabet.FacadeP;

public class main {

	public static void main(String[] args) {
		A A=new A();
		B B=new B();
		AlphabetFacade alphabetFacade=new AlphabetFacade(A, B);
		alphabetFacade.countFromHead();

	}

}
