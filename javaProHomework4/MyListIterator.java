package javaProHomework4;

import java.util.NoSuchElementException;

private class MyListIterator implements ListIterator<E> {
    private Node<E> current;
    private Node<E> lastReturned = null;
    private int index = 0;

    private MyListIterator() {
        current = head;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

   @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        lastReturned = current;
        current = current.next;
        index++;
        return lastReturned.data;
    }


    public boolean hasPrevious() {
        return current != null && current.prev != null;
    }

   @Override
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        if (current == null) {
            current = tail;
        } else {
            current = current.prev;
        }
        lastReturned = current;
        index--;
        return lastReturned.data;
    }

    @Override
    public int nextIndex() {
        return index;
    }

    @Override
    public int previousIndex() {
        return index - 1;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(E e) {

    }

    @Override
    public void add(E e) {

    }
}
// Остальные методы ListIterator (remove, set, add) можно реализовать по аналогии