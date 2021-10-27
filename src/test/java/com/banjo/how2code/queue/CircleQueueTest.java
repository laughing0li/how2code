package com.banjo.how2code.queue;

import com.banjo.how2code.queue.CircleQueue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CircleQueueTest {
    
    @Test
    public void isEmpty() {
        CircleQueue queue = new CircleQueue(4);
        System.out.print(queue.isEmpty());
    }

    @Test
    public void isFull() {
        CircleQueue queue = new CircleQueue(4);
        queue.add(1);
        queue.add(1);
        queue.add(2);
        System.out.print(queue.isFull());
    }

    @Test
    public void getList() {
        CircleQueue queue = new CircleQueue(4);
        queue.add(12);
        queue.add(31);
        queue.add(22);
        queue.list();
    }

}
