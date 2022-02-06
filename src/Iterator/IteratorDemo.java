package Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Array array = new Array(new String[]{"first, second, third"});
        Iterator iterator = new ArrayIterator(array);
        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
