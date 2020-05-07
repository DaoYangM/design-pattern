package top.daoyang.structure.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    @Test
    public void facade() {
        Facade.GameSystemFacade gameSystemFacade = new Facade.GameSystemFacade(new Facade.FireSystem(), new Facade.UserSystem());

        gameSystemFacade.shooting();
    }
}