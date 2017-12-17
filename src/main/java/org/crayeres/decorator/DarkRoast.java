package org.crayeres.decorator;

/**
 * Created by Administrator on 2017/12/13 0013.
 */
public class DarkRoast extends Beverage{

    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    public double cost() {
        return .99;
    }
}
