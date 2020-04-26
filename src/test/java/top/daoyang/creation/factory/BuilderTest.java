package top.daoyang.creation.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    @Test
    public void builderTest() {
        Builder.ProductDirector productDirector = new Builder.ProductDirector(new Builder.ConcreteProductBuilder());

        Builder.Product product = productDirector.constructProduct();
        assertNotNull(product);
        System.out.println(product);
    }

}