package com.banjo.how2code.stack;

/**
 * 数组模拟栈
 */

public class ArrayStack {
    
    // 栈最大存储数
    private int maxSize; 
    // 初始化一个数组，用于模拟栈
    private int[] stack;
    // 初始化栈顶
    private int top = -1;

    public ArrayStack(int maxSize) { 
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int i) {
        if (isFull()) {
            throw new RuntimeException("该栈已满！");
        }
        top++;
        stack[top] = i;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("该栈为空！");
        }
        int value = stack[top];
        top--;
        return value;
    }

    public void show() {
        if (isEmpty()) {
            throw new RuntimeException("该栈为空！");
        }
        while (true) {
            if (top < 0) {
                break;
            } 
            System.out.print(stack[top]+"\n");
            top--;
        }

    }
}
