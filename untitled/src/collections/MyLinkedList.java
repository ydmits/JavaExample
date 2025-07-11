package collections;

import java.util.Collection;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int index, E data) {
        checkIndex(index);

        if (index == size) {
            add(data);
            return;
        }

        Node<E> targetNode = getNode(index);
        Node<E> newNode = new Node<>(data, targetNode, targetNode.prev);

        if(targetNode.prev == null) head = newNode;
        else targetNode.prev.next = newNode;

        targetNode.prev = newNode;
        size++;
    }

    public boolean add(E data) {
        Node<E> newNode = new Node(data, null, tail);

        if (tail == null) head = newNode;
        else tail.next = newNode;

        tail = newNode;
        size++;
        return true;
    }

    public E get(int index) {
        checkIndex(index);
        Node<E> targetNode = getNode(index);
        return targetNode.data;
    }

    private Node<E> getNode(int index) {
        Node<E> targetNode;

        if(index < size / 2) {
            targetNode = head;
            for (int i = 0; i < index; i++)
                targetNode = targetNode.next;
        }
        else {
            targetNode = tail;
            for (int i = size - 1; i > index; i--)
                targetNode = targetNode.prev;
        }
        return targetNode;
    }

    public E remove(int index) {
        checkIndex(index);
        Node<E> targetNode = getNode(index);
        return destroy(targetNode);
    }

    public boolean addAll(Collection<? extends  E> collection) {
        if(collection.isEmpty()) return false;

        for (E elem : collection) add(elem);

        return  true;
    }

    private E destroy(Node<E> targetNode) {
        E data = targetNode.data;
        Node<E> next = targetNode.next;
        Node<E> prev = targetNode.prev;

        if(next == null) tail = prev;
        else next.prev = prev;

        if(prev == null) head = next;
        else prev.next = next;

        targetNode.data = null;
        size--;
        return data;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException(String.format("index = %d, size = %d", index, size));
    }


    private static class Node<E>{
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data, Node<E> next, Node<E> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
