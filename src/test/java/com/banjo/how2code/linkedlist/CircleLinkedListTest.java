package com.banjo.how2code.linkedlist;

import com.banjo.how2code.linkedlist.CircleLinkedList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CircleLinkedListTest {

    // 同时测试添加和show 列表的功能
    @Test
    public void addNode() {
        CircleLinkedList circleLinkedList = new CircleLinkedList();
        circleLinkedList.addNode(4);    
        System.out.print(circleLinkedList.list());
    }

    @Test
    public void delete() {
        CircleLinkedList circleLinkedList = new CircleLinkedList();
        circleLinkedList.addNode(4);    
        // HeroNode te = circleLinkedList.getById(4);
        System.out.print(circleLinkedList.list());
    }

    @Test
    public void order() {
        CircleLinkedList circleLinkedList = new CircleLinkedList();
        circleLinkedList.addNode(6);

        System.out.print(circleLinkedList.list());

        circleLinkedList.count(2, 2, 6);
    }
}
