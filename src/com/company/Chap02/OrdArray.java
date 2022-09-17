package com.company.Chap02;

public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] > value)
                break;
        for (int k = nElems; k > j; k--)
            a[k] = a[k - 1];

        a[j] = value;
        nElems++;
    }

    public static long[] merge(long[] arr1, long[] arr2) {
        long[] result = new long[arr1.length + arr2.length];
        int i = 0, i1 = 0, i2 = 0;
        while (i1 < arr1.length && i2 < arr2.length) {
            if (arr1[i1] < arr2[i2]) {
                result[i++] = arr1[i1++];
            } else {
                result[i++] = arr2[i2++];
            }
        }

        while(i1 < arr1.length)
            result[i++] = arr1[i1++];

        while(i2<arr2.length)
            result[i++] = arr2[i2++];

        return result;

    }


    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++)
                a[k] = a[k + 1];

            nElems--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
