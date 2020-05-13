package top.daoyang.behavioralpattern;

import org.junit.jupiter.api.Test;
import top.daoyang.behavioralpattern.chainofresponsibililty.ChainOfResponsibility;

class ChainOfResponsibilityTest {

    @Test
    public void chainOfResponsibility() {
        ChainOfResponsibility.FanEmailEmailHandler fanEmailEmailHandler =
                new ChainOfResponsibility.FanEmailEmailHandler(ChainOfResponsibility.EmailType.FAN, null);

        ChainOfResponsibility.EmailHandler spamEmailHandler =
                new ChainOfResponsibility.SpamEmailEmailHandler(ChainOfResponsibility.EmailType.SPAM, fanEmailEmailHandler);

        ChainOfResponsibility.Request spamRequest = new ChainOfResponsibility.Request(ChainOfResponsibility.EmailType.SPAM);
        ChainOfResponsibility.Request fanRequest = new ChainOfResponsibility.Request(ChainOfResponsibility.EmailType.FAN);


        spamEmailHandler.handlerEmail(spamRequest);
        spamEmailHandler.handlerEmail(fanRequest);
    }
}