package top.daoyang.creation.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

/**
 * 建造者模式
 * 优点: 建造者可以在构建对象时确定构造的顺序，客户端不需要知道顺序
 * 缺点: 当被构造的类发生变化时，构造类和监工类也要发生变化
 */
public class Builder {

    /**
     * 需要被构造的类
     */
    @Data
    @ToString
    public static class Product {
        private String ground;

        private String cement;

        private String roof;
    }

    @Getter
    public static abstract class ProductBuilder {
        protected Product product = new Product();

        public abstract void builderGround();

        public abstract void builderCement();

        public abstract void builderRoof();
    }

    /**
     * 具体的建造类
     */
    public static class ConcreteProductBuilder extends ProductBuilder {

        @Override
        public void builderGround() {
            this.product.ground = "Ground";
        }

        @Override
        public void builderCement() {
            this.product.cement = "Cement";
        }

        @Override
        public void builderRoof() {
            this.product.roof = "Roof";
        }
    }

    /**
     * 监工类负责建造顺序
     */
    @AllArgsConstructor
    public static class ProductDirector {
        private final ProductBuilder productBuilder;

        public Product constructProduct() {
            productBuilder.builderGround();
            productBuilder.builderCement();
            productBuilder.builderRoof();

            return productBuilder.getProduct();
        }
    }
}