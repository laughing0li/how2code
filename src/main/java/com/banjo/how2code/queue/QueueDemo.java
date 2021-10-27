package com.banjo.how2code.queue;

import org.springframework.stereotype.Component;

/**
 * 用数组来进行队列的模拟 这样的模拟会有一个问题 模拟的队列只能使用一次 需要使用环形队列来解决
 */

@Component
public class QueueDemo {
    private int front; // 队列的头部
    private int rear; // 队列的尾部
    private int maxSize; // 队列最多可以存储的数据量
    private int[] arr; // 初始化数组

    public QueueDemo() {
    }

    public QueueDemo(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        // 当队列没有数据的时候，头部和尾部的指向是一样的。都让他们指向第一个数据的前一个数
        // 第一个数据的下标为0，所以前一个下标为-1
        front = -1;
        rear = -1;
    }

    // 因为rear是指向第一个数据的前一个，所以当rear+1 等于maxSize的时候表明队列已经满了
    public boolean isFull() {
        return (rear + 1 == maxSize);
    }

    // 当头部和尾部相同的时候，表明为空
    public boolean isEmpty() {
        return (front == rear);
    }

    public void add(int n) {
        if (isFull()) {
            System.out.print("队列已满！");
            return;
        }
        // rear最开始指向的是第一个数据的前一个，所以先自加，arr[0]=n。
        // rear自加会将其指向下一个数值
        rear++;
        arr[rear] = n;
    }

    // 从第一个开始获取
    public int get() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据");
        }
        front++;
        return arr[front];
    }

    public void list() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据");
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }

}
