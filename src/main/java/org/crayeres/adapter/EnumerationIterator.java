package org.crayeres.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/12/20 0020.
 */
public class EnumerationIterator<E> implements Iterator{

    Enumeration<E> enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public E next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
