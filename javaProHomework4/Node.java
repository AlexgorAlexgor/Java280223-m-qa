package javaProHomework4;
//изменить класс myLinkedList на двусвязный и заменить интерфейс Iterator на ListIterator, а также реализовать соответствующие методы.

class Node<E> {
    E data;
    Node<E> prev;
    Node<E> next;

    public Node(E data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}



