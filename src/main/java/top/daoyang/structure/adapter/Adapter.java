package top.daoyang.structure.adapter;

import lombok.RequiredArgsConstructor;

/**
 * 对象适配器模式: 使一个接口能适用于另一个接口
 * <p>
 * Duck -> TurkeyAdapter -> Turkey
 */
public class Adapter {

    /**
     * 目标接口
     */
    public interface Duck {
        void quack();

        void fly();
    }

    /**
     * Adaptee被适配者
     */
    public interface Turkey {
        void gobble();

        void fly();
    }

    public static class WildTurkey implements Turkey {

        @Override
        public void gobble() {
            System.out.println("Gobble gobble");
        }

        @Override
        public void fly() {
            System.out.println("I'm flying a short distance");
        }
    }

    /**
     * 适配器对象实现目标接口，关联被适配对象
     */
    @RequiredArgsConstructor
    public static class TurkeyAdapter implements Duck {

        private final Turkey turkey;

        @Override
        public void quack() {
            turkey.gobble();
        }

        @Override
        public void fly() {
            for (int i = 0; i < 5; i++) {
                turkey.fly();
            }
        }
    }
}
