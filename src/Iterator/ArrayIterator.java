package Iterator;

public class ArrayIterator implements Iterator {
    private final Array array;
    private int position;

    public ArrayIterator(Array array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return position < array.getContext().length;
    }

    @Override
    public Object next() {
        return array.getContext()[position++];
    }
}
