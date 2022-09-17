package com.company.Chap04;

public class Deque {
    private int maxSize;
    private long[] dequeArray;
    private int left;
    private int right;
    private int nItems;

    public Deque(int s) {
        maxSize = s;
        dequeArray = new long[maxSize];
        left = -1;
        right = -1;
        nItems = 0;
    }

    public void insertLeft(long value) {
        if (left == -1 && right == -1) {
            left++;
            right++;
        } else {
            if (left - 1 < 0) {
                left = maxSize - 1;
            } else {
                left--;
            }
        }
        dequeArray[left] = value;
        nItems++;
    }

    public void insertRight(long value) {
        if (left == -1 && right == -1) {
            left++;
            right++;
        } else {
            if (right == maxSize - 1) {
                right = 0;
            } else {
                right++;
            }

        }
        dequeArray[right] = value;
        nItems++;
    }

    public long removeLeft() {
        long temp = dequeArray[left];
        if (left == maxSize - 1)
            left = 0;
        else
            left++;
        nItems--;
        return temp;
    }

    public long removeRight() {
        long temp = dequeArray[right];
        if (right == 0)
            right = maxSize - 1;
        else
            right--;
        nItems--;
        return temp;
    }

    public long peekLeft() {
        return dequeArray[left];
    }

    public long peekRight() {
        return dequeArray[right];
    }

    public void display() {
        for (int i = 0; i < nItems; i++) {
            if (left + i >= maxSize)
                System.out.print(dequeArray[left + i - maxSize] + " ");
            else
                System.out.print(dequeArray[left + i] + " ");
        }
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }
}
