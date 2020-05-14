package top.daoyang.structure.iterator;

/**
 * 迭代器模式
 */
public interface Iterator {

    boolean hasNext();
    int next();

    class IntMenu {
        private int size;

        private final int[] intMenu;

        public IntMenu() {
            intMenu = new int[10];

            addItem(1);
            addItem(2);
            addItem(3);
            addItem(4);
            addItem(5);
            addItem(6);
        }

        public void addItem(int num) {
            intMenu[size++] = num;
        }

        public Iterator getMenuItem() {
            return new Itr();
        }

        public class Itr implements Iterator {

            private int index;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public int next() {
                return IntMenu.this.intMenu[index++];
            }
        }
    }
}
