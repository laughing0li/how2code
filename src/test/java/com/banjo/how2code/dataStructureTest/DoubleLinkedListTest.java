package com.banjo.how2code.dataStructureTest;

import com.banjo.how2code.dataStructure.DoubleLinkedList;
import com.banjo.how2code.utils.ItemNode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DoubleLinkedListTest {

    ItemNode item1 = new ItemNode(1, "banjo", "nickName");    
    ItemNode item2 = new ItemNode(2, "banjo", "nickName");    
    ItemNode item3 = new ItemNode(3, "banjo", "nickName");    
    ItemNode item4 = new ItemNode(4, "banjo", "nickName");    
    ItemNode item5 = new ItemNode(5, "banjo", "nickName");    

    @Test
    public void list() {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.add(item1);
        linkedList.add(item2);
        linkedList.add(item4);
        linkedList.add(item3);
        linkedList.add(item5);
        System.out.print(linkedList.list());
    }
    
    @Test
    public void deleteById() {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.add(item1);
        linkedList.add(item2);
        linkedList.add(item4);
        linkedList.add(item3);
        linkedList.add(item5);
        linkedList.deleteById(2);
        System.out.print(linkedList.list());
    }

    @Test
    public void getById() {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.add(item1);
        linkedList.add(item2);
        linkedList.add(item4);
        linkedList.add(item3);
        linkedList.add(item5);
        System.out.print(linkedList.getById(3));
    }

    @Test
    public void checkWithId() {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.add(item1);
        linkedList.add(item2);
        linkedList.add(item4);
        linkedList.add(item3);
        linkedList.add(item5);
        linkedList.checkWithId(2);
    }

}
