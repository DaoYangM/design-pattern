package top.daoyang.creation.factory;

/**
 * 抽象工厂
 * 抽象工厂涉及到产品族和产品等级的概念
 *
 * AMD CPU 和 AMD GPU 是同一个产品族
 * AMD CPU 和 INTEL CPU 是同一个产品等级
 *
 * 优点: 增加产品族的时候能保证开闭原则
 * 缺点: 增加产品等级的手时候不能保证开闭原则，需要修改大量的类
 */
public class AbstractFactory {

    public interface CPU {
        void describe();
    }

    public interface GPU {
        void describe();
    }

    static class AMDCPU implements CPU {

        @Override
        public void describe() {
            System.out.println("AMD CPU");
        }
    }

    static class IntelCPU implements CPU {

        @Override
        public void describe() {
            System.out.println("Intel CPU");
        }
    }

    static class AMDGPU implements GPU {

        @Override
        public void describe() {
            System.out.println("AMD GPU");
        }
    }

    static class IntelGPU implements GPU {

        @Override
        public void describe() {
            System.out.println("Intel GPU");
        }
    }

    public interface ComputerFactory {
        CPU getCPU();

        GPU getGPU();
    }

    public static class AMDComputerFactory implements ComputerFactory {

        @Override
        public CPU getCPU() {
            return new AMDCPU();
        }

        @Override
        public GPU getGPU() {
            return new AMDGPU();
        }
    }

    public static class IntelComputerFactory implements ComputerFactory {

        @Override
        public CPU getCPU() {
            return new IntelCPU();
        }

        @Override
        public GPU getGPU() {
            return new IntelGPU();
        }
    }
}
