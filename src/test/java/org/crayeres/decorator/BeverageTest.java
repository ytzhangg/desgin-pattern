package org.crayeres.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2017/12/13 0013.
 */
public class BeverageTest {

    @Test
    public void testBeverage() {
        Beverage beverage = new Beverage() {
            @Override
            public double cost() {
                return 0;
            }
        };
        Assert.assertEquals(beverage.getDescription(), "Unknown Beverage");
    }

    @Test
    public void testDecorator() {
        Beverage beverage = new DarkRoast();
        beverage = new Whip(beverage);
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);

        Assert.assertEquals(beverage.getDescription(), "DarkRoast, Whip, Soy, Mocha, Mocha");
        Assert.assertEquals(String.valueOf(beverage.cost()), "1.64");
    }
}
