package top.daoyang.structure.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {

    @Test
    public void iterator() {
        Iterator.IntMenu intMenu = new Iterator.IntMenu();

        Iterator menuItem = intMenu.getMenuItem();

        while (menuItem.hasNext()) {
            System.out.println(menuItem.next());
        }

    }

}