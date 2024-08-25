package iteratorEnumeratation.adapterP;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Iterator<Object> {
	Enumeration<Object> enumeration;
	public EnumerationAdapter(Enumeration<Object> enumeration) {
		this.enumeration=enumeration;
	}
	@Override
	public boolean hasNext() {
		return this.enumeration.hasMoreElements();
	}
	@Override
	public Object next() {
		return this.enumeration.nextElement();
	}
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	

}
