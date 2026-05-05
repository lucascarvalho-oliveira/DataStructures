package dev_lucascarvalho_estruturadedados_lists.testes;

public class MyLinkedList<T> implements MyList <T>{
    private static class Node<T> {
        T dados;
        Node<T> next;

        Node(T dados) {
            this.dados = dados;
            this.next = null;
        }
    }

    private Node<T> head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override public void addFirst(T item) { }
    @Override public void addLast(T item) {  }
    @Override public void insertAt(int i, T item) {  }
    @Override public void addSorted(T element) {  }
    @Override public T removeFirst() { return null; }
    @Override public T removeLast() { return null; }
    @Override public T removeAt(int i) { return null; }
    @Override public boolean remove(T item) { return false; }
    @Override public void clear() { }
    @Override public int find(T item) { return -1; }
    @Override public T get(int i) { return null; }
    @Override public void set(int i, T item) { }
    @Override public int size() { return this.size; }
}
