package iteratorEnumeratation.adapterP;

import java.util.Enumeration;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		Enumeration<Object> enumeration=new Enumeration<Object>() {
			int[] array= {1,2,3,4,5};
			int index=0;
			@Override
			public Object nextElement() {
				return array[index+1];
			}
			
			@Override
			public boolean hasMoreElements() {
				return index+1 < array.length;
			}
		};
		Iterator<Object> enumerationAdapter=new EnumerationAdapter(enumeration);
	    System.out.println(enumerationAdapter.next());
	    System.out.println(enumerationAdapter.hasNext());;
	}

}
