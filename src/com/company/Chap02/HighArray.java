package com.company.Chap02;

public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] == searchKey)
                break;
        return !(j == nElems);
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] == value)
                break;

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

    public long getMax() {
        long max = -1;
        for (int i = 0; i < nElems; i++)
            if (a[i] > max)
                max = a[i];

        return max;
    }

    public long removeMax() {
        int indexMax = -1;
        long max = -1;
        for (int i = 0; i < nElems; i++) {
            if (a[i] > max) {
                max = a[i];
                indexMax = i;
            }
        }

        if (max >= 0) {
            for (int i = indexMax; i < nElems; i++) {
                a[i] = a[i + 1];
            }
            nElems--;
        }

        return max;
    }

    public void noDups() {
        for (int i = 0; i < nElems - 1; i++) {
            for (int j = i + 1; j < nElems; j++) {
                if (a[i] == a[j]) {
                    a[j] = -1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < nElems; i++) {
            if (a[i] == -1) {
                a[i] = a[i + 1];
                count++;
            }
        }
        nElems -= count;
    }

    public int length() {
        return nElems;
    }

}
