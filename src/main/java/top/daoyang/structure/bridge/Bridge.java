package top.daoyang.structure.bridge;

import lombok.RequiredArgsConstructor;

/**
 * <p>桥接模式</p>
 * 我们知道手机品牌很多，每种手机上面又包含各种各样的软件，
 * 我们如何表示“在手机上运行软件”这一活动？手机的品牌和软件是两个维度上的东西，
 * 可以类比为“功能层级”和“实现层级”，桥接模式的作用就是将这些不同的实现独立开来，
 * 从而应对不断的变化
 * @see <a href="https://www.imooc.com/read/53/article/1100">bridge</a>
 */
public class Bridge {

    @RequiredArgsConstructor
    public static abstract class AbstractMobilePhone {
        protected final SoftWare softWare;

        public abstract void run();
    }

    public static class IphoneMobilePhone extends AbstractMobilePhone {

        public IphoneMobilePhone(SoftWare softWare) {
            super(softWare);
        }

        @Override
        public void run() {
            softWare.rawRun();
        }

        public void gpuTurbo() {
            System.out.println("Iphone open GPU turbo");
            this.run();
        }
    }

    public static class TMobilePhone extends AbstractMobilePhone {

        public TMobilePhone(SoftWare softWare) {
            super(softWare);
        }

        @Override
        public void run() {
            softWare.rawRun();
        }

        public void tSuper() {
            System.out.println("TMobilePhone open tSuper");
            this.run();
        }
    }

    public interface SoftWare {
        void rawRun();
    }

    public static class GameSoftWare implements SoftWare {

        @Override
        public void rawRun() {
            System.out.println("Game SoftWare");
        }
    }

    public static class ChatSoftWare implements SoftWare {

        @Override
        public void rawRun() {
            System.out.println("Chat SoftWare");
        }
    }
}
