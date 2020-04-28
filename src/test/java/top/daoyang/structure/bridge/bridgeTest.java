package top.daoyang.structure.bridge;

import org.junit.jupiter.api.Test;

class bridgeTest {

    @Test
    public void bridge() {
        Bridge.AbstractMobilePhone abstractMobilePhone = new Bridge.IphoneMobilePhone(new Bridge.GameSoftWare());
        abstractMobilePhone.run();
        Bridge.IphoneMobilePhone iphoneMobilePhone = (Bridge.IphoneMobilePhone) abstractMobilePhone;
        iphoneMobilePhone.gpuTurbo();

        System.out.println();

        Bridge.AbstractMobilePhone tMobilePhoneAbstract = new Bridge.TMobilePhone(new Bridge.ChatSoftWare());
        tMobilePhoneAbstract.run();
        Bridge.TMobilePhone tMobilePhone = (Bridge.TMobilePhone) tMobilePhoneAbstract;
        tMobilePhone.tSuper();
    }
}