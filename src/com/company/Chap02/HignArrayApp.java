package com.company.Chap02;

public class HignArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        //arr.display();

//        int searchKey = 33;
//        if (arr.find(searchKey))
//            System.out.println("Found " + searchKey);
//        else
//            System.out.println("Can't find " + searchKey);

//        arr.delete(99);
//        arr.delete(11);
//        arr.delete(22);

//        arr.removeMax();
//        arr.display();
//
//        System.out.println("Max value " + arr.getMax());

//        HighArray sortedArr = new HighArray(maxSize);
//
//        while (arr.length() > 0) {
//            sortedArr.insert(arr.removeMax());
//        }

        //sortedArr.display();

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        arr.noDups();
        arr.display();
    }
}
