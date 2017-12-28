package org.crayeres.adapter;

/**
 * Created by Administrator on 2017/12/20 0020.
 */
public class DuckAdapter implements Turkey{

    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        duck.fly();
    }
}
