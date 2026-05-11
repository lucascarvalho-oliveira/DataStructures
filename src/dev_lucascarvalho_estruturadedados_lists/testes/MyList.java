package dev_lucascarvalho_estruturadedados_lists.testes;

public interface MyList <T>{

        void addFirst(T item);
        void addLast(T item);
        void insertAt(int index, T item);
        void addSorted(T element);

        T removeFirst();
        T removeLast();
        T removeAt(int index);
        boolean remove(T item);
        void clear();

        int find(T item);
        T get(int index);
        void set(int index, T item);

        int size();
}
