package top.daoyang.structure.facade;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 门面模式: 创建一个接口简化一系列子系统接口
 */
public class Facade {

    public static class FireSystem {
        public void fire() {
            System.out.println("Fire !!!");
        }

        public void loadingBullet() {
            System.out.println("I'm loading bullet");
        }
    }

    public static class UserSystem {
        public void loseBlood() {
            System.out.println("Lose Blood !!!");
        }

        public void addPoint() {
            System.out.println("Shooter add point");
        }
    }

    @Data
    @RequiredArgsConstructor
    public static class GameSystemFacade {
        private final FireSystem fireSystem;

        private final UserSystem userSystem;

        public void shooting() {
            fireSystem.fire();
            userSystem.loseBlood();
            fireSystem.loadingBullet();
            userSystem.addPoint();
        }
    }
}
