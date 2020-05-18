package top.daoyang.structure.mediator;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {

    @Test
    public void mediator() {

        Mediator.MediatorCompany mediatorCompany = new Mediator.MediatorCompany("Govern");

        Mediator.ColleagueBuyer colleagueBuyer = new Mediator.ColleagueBuyer("Ye", mediatorCompany);

        Mediator.ColleagueSeller colleagueSeller = new Mediator.ColleagueSeller("XI", mediatorCompany);

        mediatorCompany.setBuyer(colleagueBuyer);
        mediatorCompany.setSeller(colleagueSeller);

        colleagueSeller.callMediatorCompany();
        colleagueBuyer.callMediatorCompany();

    }

}