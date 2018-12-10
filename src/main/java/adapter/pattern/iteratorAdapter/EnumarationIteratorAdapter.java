package adapter.pattern.iteratorAdapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumarationIteratorAdapter implements Iterator<Object> {

    Enumeration<?> enumeration;

    public EnumarationIteratorAdapter(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    // It is not needed - we have default method in Iterator interface;
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
