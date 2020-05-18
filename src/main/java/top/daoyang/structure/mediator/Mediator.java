package top.daoyang.structure.mediator;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Mediator
 */
public class Mediator {

    @Data
    @RequiredArgsConstructor
    public static class MediatorCompany {

        private final String name;

        private ColleagueSeller seller;

        private ColleagueBuyer buyer;

        public void publishHouse() {
            buyer.getMessage("Mediator: Seller (" + seller.getName() + ") wanna seller a house");
        }

        public void buyHouse() {
            seller.getMessage("Mediator: Buyer (" + buyer.getName() + ") wanna buy a house");
        }
    }

    @Data
    @RequiredArgsConstructor
    public abstract static class Colleague {

        protected final String name;

        protected final MediatorCompany mediatorCompany;

        public abstract void callMediatorCompany();

        public abstract void getMessage(String message);
    }

    public static class ColleagueSeller extends Colleague {

        public ColleagueSeller(String name, MediatorCompany mediatorCompany) {
            super(name, mediatorCompany);
        }

        @Override
        public void callMediatorCompany() {
            mediatorCompany.publishHouse();
        }

        @Override
        public void getMessage(String message) {
            System.out.println("Seller " + name + " get message: " + message);
        }
    }

    public static class ColleagueBuyer extends Colleague {

        public ColleagueBuyer(String name, MediatorCompany mediatorCompany) {
            super(name, mediatorCompany);
        }

        @Override
        public void callMediatorCompany() {
            mediatorCompany.buyHouse();
        }

        @Override
        public void getMessage(String message) {
            System.out.println("Buyer " + name + " get message: " + message);
        }
    }
}
