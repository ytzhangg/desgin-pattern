package org.crayeres.iterator;

import java.util.Iterator;

public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    private void printMeun(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem next = iterator.next();
            System.out.print(next.getName() + ", ");
            System.out.print(next.getPrice() + " -- ");
            System.out.println(next.getDescription());
        }
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {

            }
        }
    }
}
