package com.company.Chap04;

public class PriorityQ {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQ(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        /*int j;
        if (nItems == 0)
            queArray[nItems++] = item;
        else {
            for (j = nItems - 1; j >= 0; j--) {
                if (item > queArray[j])
                    queArray[j + 1] = queArray[j];
                else
                    break;
            }
            queArray[j + 1] = item;
            nItems++;
        }*/
        queArray[nItems++] = item;
    }

    public long remove() {
        //return queArray[--nItems];
        int indexMin = 0;
        for(int i = 1; i < nItems;i++) {
            if (queArray[i] < queArray[indexMin])
                indexMin = i;
        }

        long temp = queArray[indexMin];

        for(int i = indexMin; i < nItems; i++)
            queArray[i] = queArray[i+1];

        nItems--;
        return temp;
    }

    public void display() {
        long[] temp = queArray.clone();

        int out, in;
        for (out = nItems - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (temp[in] > temp[in + 1]) {
                    long k = temp[in];
                    temp[in] = temp[in+1];
                    temp[in+1] = k;
                }
            }
        }

        for(int i =0; i< nItems;i++)
            System.out.print(temp[i] +" ");

    }

    public long peekMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }
}
