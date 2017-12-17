package org.crayeres.decorator;

/**
 * Created by Administrator on 2017/12/13 0013.
 */
public class Espresso extends Beverage{

    @Override
    public String getDescription() {
        return "Espresso";
    }

    public double cost() {
        return 1.05;
    }
}
