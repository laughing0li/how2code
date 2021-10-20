package com.banjo.how2code.dataStructure;

import java.util.Arrays;

/**
 *
 * 环形队列，解决用数组来模拟队列的不能复用的问题
 * front: 指向队列的第一个位置，即指向队列下标为0的位置
 * rear: 指向队列的最后一个位置的后一个位置，即下面预留出来的那个约定位置
 * 最后一个位置空出用于实现环形
 * maxSize: 该队列最大可存储多少个数据
 * 所以，可以得出结论。该队列的最大可用空间等于maxSize - 1.
 * 因为有预留空间
 * */

public class CircleQueue {
    private int maxSize;
    // front 和 rear 都是下标
    private int front;
    private int rear;
    private int[] arr;

    public CircleQueue() {
    }

    public CircleQueue(int maxSize) {
        this.maxSize = maxSize;
        front = 0;
        rear = 0;
        arr = new int[maxSize];
    }

    public boolean isFull() {
        
        // eg：maxSize=4, front=0。根据约定的，要预留一个空间
        // 所以最多可以存储3个数值。下标从0开始，0,1,2 所以下标为2
        // 应该是最后一个数值。但是rear是指向的最后一个数值的后一位
        // 所以rear应该 为 3。 所以 (3 + 1) % 4 == 0    
        return front == (rear + 1) % maxSize;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void add(int n) {
        if(isFull()) {
            System.out.print("队列已满！");
            return;
        }
        arr[rear] = n;
        // 因为是模拟环形，所以要对可以存储的最大数进行取余，才能确定下一位置是哪里
        rear = (rear + 1) % maxSize;
    }

    public int get() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据");
        }
        int num = arr[front];
        // 因为是模拟环形，所以要对可以存储的最大数进行取余，才能确定下一位置是哪里
        front = (front + 1) % maxSize;
        return num;

    }

    public void list() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据");
        }
        System.out.print(Arrays.toString(arr));
    }

}
