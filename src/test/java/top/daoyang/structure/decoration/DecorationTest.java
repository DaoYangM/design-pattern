package top.daoyang.structure.decoration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecorationTest {

    @Test
    public void decoration() {
        Decoration.Beverage darkRoast = new Decoration.DarkRoast();

        Decoration.CondimentDecorator mochaDarkRoast = new Decoration.Mocha(darkRoast);

        System.out.println(mochaDarkRoast.getDescription());
        assertEquals(mochaDarkRoast.cost(), 1.09);
    }

}