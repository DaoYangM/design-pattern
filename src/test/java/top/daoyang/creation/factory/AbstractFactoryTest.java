package top.daoyang.creation.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    public void abstractFactoryTest() {
        AbstractFactory.ComputerFactory amd = new AbstractFactory.AMDComputerFactory();

        assertNotNull(amd);
        assertNotNull(amd.getCPU());
        assertNotNull(amd.getGPU());
        amd.getCPU().describe();
        amd.getGPU().describe();

        AbstractFactory.ComputerFactory intel = new AbstractFactory.IntelComputerFactory();
        assertNotNull(intel);
        assertNotNull(intel.getGPU());
        assertNotNull(intel.getCPU());
        intel.getGPU().describe();
        intel.getCPU().describe();
    }
}