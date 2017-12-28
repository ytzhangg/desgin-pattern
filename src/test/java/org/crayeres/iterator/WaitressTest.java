package org.crayeres.iterator;


import org.junit.Test;

import java.util.Iterator;

public class WaitressTest {

    @Test
    public void printMenu() throws Exception {
        PancakeHouseMenu packageHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        //Waitress waitress = new Waitress(packageHouseMenu, dinerMenu);
        //waitress.printMenu();
    }

    @Test
    public void printMenuComponent() {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combines");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        waitress.printVegetarianMenu();
    }


}