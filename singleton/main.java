package singleton;

public class main {

	public static void main(String[] args) {
		MyClass myclass1=MyClass.getInstance("FOO");
        MyClass myclass2=MyClass.getInstance("BAR");
        System.out.println(myclass1.value);
        System.out.println(myclass2.value);
	}

}
