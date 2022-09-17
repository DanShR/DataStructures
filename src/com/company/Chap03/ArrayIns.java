package com.company.Chap03;

public class ArrayIns {
    private long[] a;
    private int nElems;

    public ArrayIns(int max) {
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

    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];
                in--;
            }
            a[in] = temp;
        }
    }

    public void insertionSortStatistics() {
        int in, out;
        int countCopies = 0, countComparisons =0;
        for (out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while (in > 0) {
                countComparisons++;
                if (a[in - 1] >= temp) {
                    a[in] = a[in - 1];
                    countCopies++;
                } else {
                    break;
                }

                in--;
            }
            a[in] = temp;
        }
        System.out.println("Count comparisons " + countComparisons);
        System.out.println("Count copies " + countCopies);
    }


    public double median() {
        long[] arr = a;
        for (int out = 1; out < nElems; out++) {
            int in = out;
            long temp = arr[out];
            while (in > 0 && arr[in - 1] > temp) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }

        double result;

        if (arr.length % 2 == 0) {
            result = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
        } else {
            result = arr[arr.length / 2];
        }

        return result;
    }

    public void insertionSortNoDups() {
        int count = 0;
        for (int i = 0; i < nElems - 1; i++) {
            for (int j = i + 1; j < nElems; j++) {
                if (a[i] == a[j] && a[j] >= 0) {
                    a[j] = -1;
                    count++;
                }
            }
        }

        insertionSort();

        for(int i = count, j = 0; i < nElems; i++, j++) {
            a[j] = a[i];
        }

        nElems -= count;

    }

    public void noDups() {

        for (int i = 0; i < nElems - 1; i++) {
            int j = i + 1;
            while (j < nElems && a[i] == a[j])
                j++;
            if (j == (i + 1))
                continue;

            for (int k = i + 1, m = j; m < nElems; k++, m++) {
                a[k] = a[m];
            }
            nElems -= j - i - 1;
        }
    }
}
