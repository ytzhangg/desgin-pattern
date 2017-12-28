package org.crayeres.adapter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/12/20 0020.
 */
public class EnumerationIteratorTest {

    @Test
    public void testArrayList() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> iterator = list.iterator();
        Enumeration<String> enumeration = new IteratorEnumeration(iterator);
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}