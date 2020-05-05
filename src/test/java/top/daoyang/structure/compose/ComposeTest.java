package top.daoyang.structure.compose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComposeTest {

    @Test
    public void compose() {
        Compose.Component root = new Compose.Composite("root");


        Compose.Component rootLeft = new Compose.Composite("rootLeft");
        Compose.Component rootRight = new Compose.Composite("rootRight");

        rootLeft.add(new Compose.Leaf("rootLeft-Leaf"));
        rootRight.add(new Compose.Leaf("rootRight-leaf"));

        root.add(rootLeft);
        root.add(rootRight);

        root.display();
    }

}