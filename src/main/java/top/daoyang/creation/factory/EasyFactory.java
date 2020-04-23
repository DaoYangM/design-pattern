package top.daoyang.creation.factory;

/**
 * 简单工厂类
 */
public class EasyFactory {
    /**
     * 发送接口
     */
    public interface Sender {
        /**
         * 发送方法
         */
        void send();
    }

    /**
     * ExpressSender
     * @see top.daoyang.creation.factory.EasyFactory.Sender
     */
    public static class ExpressSender implements Sender {

        @Override
        public void send() {
            System.out.println("Express Sender");
        }
    }

    /**
     * EmailSender 实现接口 {@link Sender} 的{@code send}方法
     */
    public static class EmailSender implements Sender {

        @Override
        public void send() {
            System.out.println("Email sender");
        }
    }

    public Sender getSender(String senderName) {
        if (senderName.equalsIgnoreCase("express")) {
            return new ExpressSender();
        } else if (senderName.equalsIgnoreCase("sms")) {
            return () -> System.out.println("SmsSender");
        } else if (senderName.equalsIgnoreCase("Email")) {
            return new EmailSender();
        }

        return null;
    }
}
