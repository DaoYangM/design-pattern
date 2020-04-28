package top.daoyang.structure.adapter;

import org.junit.jupiter.api.Test;

class AdapterTest {

    @Test
    public void testAdapter() {
        Adapter.Duck fakeTurkeyDuck = new Adapter.TurkeyAdapter(new Adapter.WildTurkey());

        fakeTurkeyDuck.quack();
        fakeTurkeyDuck.fly();
    }

}