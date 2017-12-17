package org.crayeres.factory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2017/12/15 0015.
 */
public class ChocolateBoilerTest {

    @Test
    public void testSingleton() {
        ChocolateBoiler instanceOne = ChocolateBoiler.getInstance();
        ChocolateBoiler instanceTwo = ChocolateBoiler.getInstance();
        Assert.assertEquals(instanceOne, instanceTwo);
    }
}
