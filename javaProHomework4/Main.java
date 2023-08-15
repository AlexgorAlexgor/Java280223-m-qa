package javaProHomework4;

import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        ListIterator<Integer> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}