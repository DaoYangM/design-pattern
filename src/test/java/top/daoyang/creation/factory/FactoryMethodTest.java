package top.daoyang.creation.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactoryMethodTest {

    @Test
    public void test() {
       FactoryMethod.ExpressSenderProvider expressSenderProvider = new FactoryMethod.ExpressSenderProvider();
        EasyFactory.Sender expressSender = expressSenderProvider.providerSender();
        Assertions.assertNotNull(expressSender);
        expressSender.send();

        FactoryMethod.SmsSenderProvider smsSenderProvider = new FactoryMethod.SmsSenderProvider();
        EasyFactory.Sender smsSender = smsSenderProvider.providerSender();
        Assertions.assertNotNull(smsSender);
        smsSender.send();
    }
}