package com.company.Chap04;

public class PriorityQApp {
    public static void main(String[] args) {
        PriorityQ priorityQ = new PriorityQ(10);

        priorityQ.insert(30);
        priorityQ.insert(50);
        priorityQ.insert(10);
        priorityQ.insert(40);
        priorityQ.insert(20);
        priorityQ.insert(60);

        priorityQ.display();
    }
}
