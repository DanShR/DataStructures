package com.company.Chap03;

public class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems++] = value;
    }

    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public void bubbleSort() {
        for (int left = 0, right = nElems - 1; left < right; left++, right--) {
            for (int in = left; in < right; in++)
                if (a[in] > a[in + 1])
                    swap(in, in + 1);
            for (int in = right; in > left; in--)
                if (a[in] < a[in - 1])
                    swap(in, in - 1);
        }

        /*int out, in;
        for (out = nElems - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }*/
    }


    public void oddEvenSort() {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < nElems - 1; i += 2) {
                if (a[i] > a[i+1]) {
                    swap(i, i + 1);
                    isSorted = false;
                }
            }
            for(int i = 1; i < nElems -1; i+=2){
                if (a[i] > a[i+1]) {
                    swap(i, i + 1);
                    isSorted = false;
                }

            }
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
