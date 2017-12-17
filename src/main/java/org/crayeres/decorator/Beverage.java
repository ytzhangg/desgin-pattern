package org.crayeres.decorator;

/**
 * Created by Administrator on 2017/12/13 0013.
 */
public abstract class Beverage {

    private String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
