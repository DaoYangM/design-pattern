package top.daoyang.behavioralpattern;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 责任链模式
 */
public class ChainOfResponsibility {

    public static enum EmailType {
        SPAM,
        FAN,
        COMPLAINT,
        NEW_LOCATION;
    }

    @Data
    @RequiredArgsConstructor
    public static class Request {
        private final EmailType emailType;
    }

    @RequiredArgsConstructor
    public static abstract class EmailHandler {
        private final EmailType emailType;

        private final EmailHandler nextHandler;

        public final void handlerEmail(Request request) {


            if (emailType == request.getEmailType()) {
                response(request);
            } else {
                System.out.println(emailType + " Skip");
                if (nextHandler != null)
                    nextHandler.handlerEmail(request);
            }
        }

        protected abstract void response(Request request);
    }

    public static class SpamEmailEmailHandler extends EmailHandler {

        public SpamEmailEmailHandler(EmailType emailType, EmailHandler nextHandler) {
            super(emailType, nextHandler);
        }

        @Override
        protected void response(Request request) {
            System.out.println("Spam email handler checked");
        }
    }

    public static class FanEmailEmailHandler extends EmailHandler {

        public FanEmailEmailHandler(EmailType emailType, EmailHandler nextHandler) {
            super(emailType, nextHandler);
        }

        @Override
        protected void response(Request request) {
            System.out.println("Fan email handler checked");
        }
    }
}
