package org.crayeres.template;

/**
 * Created by Administrator on 2017/12/22 0022.
 */
public class Coffee extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
