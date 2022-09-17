package com.company.Chap02;

public class OrderedApp {
    public static void main(String[] args) {
        /*int maxSize = 100;
        OrdArray arr = new OrdArray(maxSize);

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

        int searchKey = 33;
        if (arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(99);
        arr.delete(11);
        arr.delete(22);

//        arr.removeMax();
        arr.display();
//
//        System.out.println("Max value " + arr.getMax());
*/

        long[] arr1 = new long[10];
        arr1[0] = 1;
        arr1[1] = 3;
        arr1[2] = 5;
        arr1[3] = 7;
        arr1[4] = 8;
        arr1[5] = 9;
        arr1[6] = 10;
        arr1[7] = 13;
        arr1[8] = 14;
        arr1[9] = 18;

        long[] arr2 = new long[7];
        arr2[0] = 2;
        arr2[1] = 4;
        arr2[2] = 5;
        arr2[3] = 6;
        arr2[4] = 12;
        arr2[5] = 17;
        arr2[6] = 22;

        long[] merge = OrdArray.merge(arr1, arr2);

        for(int i =0; i < merge.length;i++)
            System.out.print(merge[i] + " ");

    }
}
