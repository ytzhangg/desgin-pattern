package org.crayeres.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/12/20 0020.
 */
public class IteratorEnumeration<E> implements Enumeration{

    Iterator<E> iterator;

    public IteratorEnumeration(Iterator<E> iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public E nextElement() {
        return iterator.next();
    }

    public void remove() {
        iterator.remove();
    }
}
