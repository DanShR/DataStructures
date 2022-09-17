package com.company.Chap03;

import java.util.Random;

public class InsertSortApp {
    public static void main(String[] args) {
        Random random = new Random();
        int maxSize = 20;
        ArrayIns arr = new ArrayIns(maxSize);
        for (int i = 0; i < maxSize; i++)
            arr.insert(random.nextInt(10));
        //arr.display();
        //arr.insertionSort();
        //arr.display();
        //System.out.println(arr.median());
        //arr.insertionSort();



        arr.display();
        arr.insertionSortNoDups();

        arr.display();

    }
}
