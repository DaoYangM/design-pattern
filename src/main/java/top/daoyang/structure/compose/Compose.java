package top.daoyang.structure.compose;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 */
public class Compose {

    @Data
    @RequiredArgsConstructor
    public static abstract class Component {
        protected final String name;

        public abstract void display();

        public abstract void add(Component component);

        public abstract Component remove();
    }

    public static class Leaf extends Component {

        public Leaf(String name) {
            super(name);
        }

        @Override
        public void display() {
            System.out.println("leaf " + name);
        }

        @Override
        public void add(Component component) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Component remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static class Composite extends Component {

        private final List<Component> components = new ArrayList<>();

        public Composite(String name) {
            super(name);
        }

        @Override
        public void display() {
            System.out.println("composite " + name);
            components.forEach(Component::display);
        }

        @Override
        public void add(Component component) {
            components.add(component);
        }

        @Override
        public Component remove() {
            return components.remove(components.size() - 1);
        }
    }
}
