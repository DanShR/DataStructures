package com.company.Chap04;

public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);

        theQueue.insert(10);
//        theQueue.insert(20);
//        theQueue.insert(30);
//        theQueue.insert(40);
//        theQueue.insert(50);

        theQueue.remove();
//        theQueue.remove();
//        theQueue.remove();

        theQueue.insert(60);
//        theQueue.insert(70);

        theQueue.display();

    }
}
