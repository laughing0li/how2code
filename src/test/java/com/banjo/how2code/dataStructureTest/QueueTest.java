package com.banjo.how2code.dataStructureTest;


import com.banjo.how2code.dataStructure.QueueDemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QueueTest {
    
    @Test
    public void testIsFull() {
        QueueDemo queueDemo = new QueueDemo(4);
        queueDemo.add(1);
        queueDemo.add(1);
        queueDemo.add(1);
        queueDemo.add(1);
        System.out.println(queueDemo.isFull());
    }

    @Test
    public void testIsEmpty(){
        QueueDemo queueDemo = new QueueDemo(4);
        queueDemo.add(13);
        queueDemo.add(3);
        queueDemo.add(12);
        queueDemo.add(14);
        System.out.print(queueDemo.get());
        System.out.print(queueDemo.get());
        System.out.print(queueDemo.get());
        System.out.print(queueDemo.get());
    }

    @Test
    public void testList() {
        QueueDemo queueDemo = new QueueDemo(4);
        queueDemo.add(13);
        queueDemo.add(3);
        queueDemo.add(12);
        queueDemo.add(14);
        queueDemo.list();
    }
}
