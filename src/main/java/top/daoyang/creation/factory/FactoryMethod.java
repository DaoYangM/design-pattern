package top.daoyang.creation.factory;

import top.daoyang.creation.factory.EasyFactory.Sender;

/**
 * 工厂方法
 */
public class FactoryMethod {

    /**
     * 不同的类别的工厂需要实现这个接口
     */
    @FunctionalInterface
    public interface Provider {
        Sender providerSender();
    }

    public static class ExpressSenderProvider implements Provider {
        @Override
        public Sender providerSender() {
            return new EasyFactory.ExpressSender();
        }
    }

    public static class SmsSenderProvider implements Provider {

        @Override
        public Sender providerSender() {
            return () -> System.out.println("Sms sender");
        }
    }
}
