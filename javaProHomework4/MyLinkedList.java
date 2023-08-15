package javaProHomework4;

import java.util.Iterator;
import java.util.ListIterator;

  /*  Изменить myLinkedList на двусвязный
    Изменить интерфейс с Iterator на ListIterator
    Реализовать соответствующие методы*/
public class MyLinkedList<E> implements Iterable<E> {
    private Node<E> head;
    private Node<E> tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public ListIterator<E> listIterator() {
        return (ListIterator<E>) new MyListIterator();
    }



  }
