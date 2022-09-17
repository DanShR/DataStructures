package com.company.Chap04;

import java.util.Random;
import java.util.Scanner;

public class Shop {

    private static Queue[] queues;
    private static int maxSize = 20;
    private static int count = 3;

    static {
        queues = new Queue[count];
        for(int i = 0; i <count;i++)
            queues[i] = new Queue(maxSize);
    }

    private static void push() {
        Random random = new Random();
        queues[random.nextInt(3) ].insert(1);
    }

    private static void display() {
        System.out.println();
        for (int i = 0; i <count;i++) {
            queues[i].display();
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int maxSize = 20;

        Queue queue = new Queue(maxSize);
        Queue cashRegister2 = new Queue(maxSize);
        Queue cashRegister3 = new Queue(maxSize);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String s = scanner.next();
            if ( "q".equals(s))
                break;
            switch (s) {
                case "a":
                   push();
                   display();
                   break;


            }
        }
    }
}
