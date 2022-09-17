package com.company.Chap04;

public class StackDeq {
    private Deque deque;
    public StackDeq(int size) {
        deque = new Deque(size);
    }

    public void push(long value) {
        deque.insertRight(value);
    }

    public long pop() {
        return deque.removeRight();
    }

    public long peek() {
        return deque.peekRight();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
}
