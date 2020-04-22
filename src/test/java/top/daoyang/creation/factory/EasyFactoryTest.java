package top.daoyang.creation.factory;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyFactoryTest {

    @Test
    void getSender() {
        EasyFactory easyFactory = new EasyFactory();

        EasyFactory.Sender express = easyFactory.getSender("express");
        Assert.assertNotNull(express);

        EasyFactory.Sender sms = easyFactory.getSender("sms");
        Assert.assertNotNull(sms);

        EasyFactory.Sender email = easyFactory.getSender("email");
        Assert.assertNotNull(email);

        EasyFactory.Sender test = easyFactory.getSender("test");
        Assert.assertNull(test);
    }
}