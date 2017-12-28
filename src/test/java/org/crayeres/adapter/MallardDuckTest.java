package org.crayeres.adapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/12/20 0020.
 */
public class MallardDuckTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void quack() throws Exception {
        Duck duck = new MallardDuck();
        duck.quack();
    }

    @Test
    public void fly() throws Exception {
        Duck duck = new MallardDuck();
        duck.fly();
    }

}