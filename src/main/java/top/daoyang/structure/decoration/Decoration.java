package top.daoyang.structure.decoration;

import lombok.RequiredArgsConstructor;

/**
 * 装饰者模式
 */
public class Decoration {

    public static abstract class Beverage {
        protected String description = "Unknown Beverage";

        public String getDescription() {
            return description;
        }

        public abstract double cost();
    }

    public static class DarkRoast extends Beverage {

        public DarkRoast() {
            description = "Dark Roast";
        }

        @Override
        public double cost() {
            return 0.99;
        }
    }

    public static abstract class CondimentDecorator extends Beverage {
        public abstract String getDescription();
    }

    @RequiredArgsConstructor
    public static class Mocha extends CondimentDecorator {

        private final Beverage beverage;

        @Override
        public double cost() {
            return beverage.cost() + 0.1;
        }

        @Override
        public String getDescription() {
            return beverage.getDescription() + " Mocha";
        }
    }
}
