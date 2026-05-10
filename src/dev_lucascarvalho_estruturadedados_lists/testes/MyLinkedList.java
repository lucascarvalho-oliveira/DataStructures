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

    @Override public void addFirst(T item) {
        Node<T> novo = new Node<>(item);

        novo.next = head;
        head = novo;

        size++;
    }

    @Override public void addLast(T item) {
        Node<T> novo = new Node<>(item);

        if(head == null){
            head = novo;
        }else{
            Node<T> atual = head;

            while(atual.next != null){
                atual = atual.next;
            }

            atual.next = novo;
        }

        size++;
    }

    @Override public void insertAt(int index, T item) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if(index == 0){
            addFirst(item);
        }

        Node<T> novo = new Node<>(item);

        Node<T> atual = head;

        for(int i = 0; i < index - 1; i++){
            atual = atual.next;
        }

        novo.next = atual.next;

        atual.next = novo;

        size++;
    }

    @Override public void addSorted(T element) {

    }

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
