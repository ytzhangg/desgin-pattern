package org.crayeres.template;

/**
 * Created by Administrator on 2017/12/22 0022.
 */
public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
