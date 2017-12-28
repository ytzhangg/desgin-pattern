package org.crayeres.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] menuItems;

    int postion = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (postion < menuItems.length && menuItems[postion] != null) {
            return true;
        } else {
            return false;
        }
    }

    public MenuItem next() {
        if (postion < menuItems.length) {
            MenuItem menuItem = menuItems[postion];
            postion++;
            return menuItem;
        } else {
            throw new IllegalStateException("MenuItems don't have next item");
        }
    }

    public void remove() {
        for (int i = postion - 1; i < menuItems.length - 1; i++) {
            menuItems[i] = menuItems[i + 1];
        }
        menuItems[menuItems.length - 1] = null;
    }
}
