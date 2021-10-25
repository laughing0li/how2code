package com.banjo.how2code.dataStructureTest;

import com.banjo.how2code.dataStructure.CircleLinkedList;
import com.banjo.how2code.utils.HeroNode;

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

}
