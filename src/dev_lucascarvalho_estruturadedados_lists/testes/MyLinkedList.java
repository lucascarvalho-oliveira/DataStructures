package dev_lucascarvalho_estruturadedados_lists.testes;

import java.util.NoSuchElementException;

public class MyLinkedList<T extends Comparable<T>> implements MyList <T>{
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

    @Override public void addSorted(T item) {
        Node<T> novo = new Node<>(item);

        if(head == null || item.compareTo(head.dados) < 0){
            novo.next = head;
            head = novo;
        }else{
            Node<T> atual = head;

            while(atual.next != null && item.compareTo(atual.next.dados) > 0){
                atual = atual.next;
            }

            novo.next = atual.next;
            atual.next = novo;
        }

        size++;
    }

    @Override public T removeFirst() {
        if(head == null){
            throw new NoSuchElementException();
        }

        T removido = head.dados;

        head = head.next;

        size--;
        return  removido;
    }

    @Override public T removeLast() {
        if(head == null){
            throw new NoSuchElementException();
        }

        if(head.next == null){
            T removido = head.dados;

            head = null;
            size--;
        }

        Node<T> atual = head;

        while(atual.next.next != null){
            atual = atual.next;
        }

        T removido = atual.next.dados;
        atual.next = null;
        size--;

        return removido;
    }

    @Override public T removeAt(int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if(index == 0){
            return removeFirst();
        }

        Node<T> atual = head;

        for(int i = 0; i < index - 1; i++) {
            atual = atual.next;
        }

        T removido = atual.next.dados;
        atual.next = atual.next.next;
        size--;

        return removido;
    }

    @Override public boolean remove(T item) {
        if(head == null) {
            return false;
        }

        if(head.dados.equals(item)){
            head = head.next;
            size--;

            return true;
        }

        Node<T> atual = head;

        while(atual.next != null && !atual.next.dados.equals(item)){
            atual = atual.next;
        }

        if(atual.next == null){
            return false;
        }

        atual.next = atual.next.next;
        size--;

        return true;
    }

    @Override public void clear() {
        head = null;
        size = 0;
    }

    @Override public int find(T item) {
        Node<T> atual = head;
        int index = 0;

        while(atual != null){
            if(atual.dados.equals(item)){
                return index;
            }

            atual = atual.next;
            index++;
        }
        return -1;
    }

    @Override public T get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> atual = head;

        for(int i = 0; i < index; i++) {
            atual = atual.next;
        }

        return atual.dados;
    }

    @Override public void set(int index, T item) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> atual = head;

        for(int i = 0; i < index; i++) {
            atual = atual.next;
        }

        atual.dados = item;
    }

    @Override public int size() {
        return this.size;
    }
}
