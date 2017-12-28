package org.crayeres.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/12/20 0020.
 */
public class TurkeyAdapterTest {
    @Test
    public void quack() throws Exception {
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
    }

    @Test
    public void fly() throws Exception {
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.fly();
    }

}