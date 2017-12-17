package org.crayeres.decorator;

/**
 * Created by Administrator on 2017/12/13 0013.
 */
public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    public double cost() {
        return .89;
    }
}
