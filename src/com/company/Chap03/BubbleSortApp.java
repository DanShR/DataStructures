package com.company.Chap03;

import java.util.Random;

public class BubbleSortApp {
    public static void main(String[] args) {
        Random random = new Random();
        int maxSize = 10;
        ArrayBub arr = new ArrayBub(maxSize);
        for (int i = maxSize; i >0 ; i--)
            arr.insert(i);
        arr.display();
        arr.oddEvenSort();
        arr.display();

    }
}
