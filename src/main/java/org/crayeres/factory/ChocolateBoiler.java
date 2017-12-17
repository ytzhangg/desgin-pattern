package org.crayeres.factory;

/**
 * Created by Administrator on 2017/12/15 0015.
 */
public class ChocolateBoiler {

    private ChocolateBoiler() {
    }

    private static ChocolateBoiler chocolateBoiler;

    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoiler == null) {
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }
}
