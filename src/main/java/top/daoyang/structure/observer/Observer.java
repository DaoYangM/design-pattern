package top.daoyang.structure.observer;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 */
public class Observer {

    public interface IReader {
        void update(String bookName);
    }

    @RequiredArgsConstructor
    public static class Reader implements IReader {

        private final String name;

        @Override
        public void update(String bookName) {
            System.out.println(name + " get updating " + bookName);
        }
    }

    public interface IPlatform {
        void attach(IReader iReader);

        void detach(IReader iReader);

        void notifyObservers(String name);
    }

    public static class Platform implements IPlatform {

        private final List<IReader> readerList;

        public Platform() {
            this.readerList = new ArrayList<>();
        }

        @Override
        public void attach(IReader iReader) {
            readerList.add(iReader);
        }

        @Override
        public void detach(IReader iReader) {
            readerList.remove(iReader);
        }

        @Override
        public void notifyObservers(String name) {
            readerList.forEach(iReader -> iReader.update(name));
        }
    }
}
