package top.daoyang.creation.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EasyFactoryTest {

    @Test
    void getSender() {
        EasyFactory easyFactory = new EasyFactory();

        EasyFactory.Sender express = easyFactory.getSender("express");

        Assertions.assertNotNull(express);

        EasyFactory.Sender sms = easyFactory.getSender("sms");
        Assertions.assertNotNull(sms);

        EasyFactory.Sender email = easyFactory.getSender("email");
        Assertions.assertNotNull(email);
        email.send();

        EasyFactory.Sender test = easyFactory.getSender("test");
        Assertions.assertNull(test);
    }
}