package list;


import java.util.ArrayList;

public class GenericQueue<T> {

    private static final int CAPACIDAD_INICIAL = 10;
    private static final int TOP = 0;

    private ArrayList<T> collection = new ArrayList<>(CAPACIDAD_INICIAL);

    public void enqueue(T element) {
        collection.add(collection.size(), element);
    }

    public T dequeue() {
        return collection.remove(TOP);
    }

    public int size() {
         return collection.size();

    }

    public T get( int valor) {
        return collection.get(valor);
    }


}

