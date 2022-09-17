package com.company.Chap04;

public class DequeApp {
    public static void main(String[] args) {
        Deque deque = new Deque(10);
        deque.insertRight(10);
        deque.insertRight(20);
        deque.insertRight(30);
        deque.insertRight(40);

        deque.removeRight();
        deque.removeRight();

        deque.insertLeft(5);
        deque.insertLeft(15);
        deque.insertLeft(25);
        deque.insertLeft(35);

        deque.insertRight(50);
        deque.insertRight(60);

        deque.display();

    }
}
