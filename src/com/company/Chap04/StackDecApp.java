package com.company.Chap04;

public class StackDecApp {
    public static void main(String[] args) {
        StackDeq stack = new StackDeq(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.push(40);

        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }

}
