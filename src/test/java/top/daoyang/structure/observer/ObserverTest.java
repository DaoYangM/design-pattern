package top.daoyang.structure.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @Test
    public void Observer() {
        Observer.IReader reader1 = new Observer.Reader("reader-1");
        Observer.IReader reader2 = new Observer.Reader("reader-2");
        Observer.IReader reader3 = new Observer.Reader("reader-3");

        Observer.IPlatform platform = new Observer.Platform();
        platform.attach(reader1);
        platform.attach(reader2);
        platform.attach(reader3);

        platform.notifyObservers("update platform");
    }
}