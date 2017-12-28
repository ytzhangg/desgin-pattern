package org.crayeres.iterator;

import java.util.Iterator;

public class NullIterator implements Iterator{
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {

    }
}
