package com.banjo.how2code.dataStructureTest;

import com.banjo.how2code.dataStructure.SingleLinkedList;
import com.banjo.how2code.HeroNode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SingleLinkedListTest {

    HeroNode heroNode1 = new HeroNode(1, "暗影之拳", "阿卡丽");
    HeroNode heroNode2 = new HeroNode(2, "牛头酋长", "阿利斯塔");
    HeroNode heroNode3 = new HeroNode(3, "殇之木乃伊", "阿木木");
    HeroNode heroNode4 = new HeroNode(4, "冰晶凤凰", "艾尼维亚");
    HeroNode heroNode5 = new HeroNode(5, "黑暗之女", "安妮");

    @Test
    public void show() {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.add(heroNode1);
        linkedList.add(heroNode5);
        linkedList.add(heroNode2);
        linkedList.add(heroNode4);
        linkedList.add(heroNode3);
        linkedList.show();
    }

    @Test
    public void deleteById() {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.add(heroNode1);
        linkedList.add(heroNode5);
        linkedList.add(heroNode2);
        linkedList.add(heroNode4);
        linkedList.add(heroNode3);

        linkedList.deleteById(3);
        linkedList.deleteById(3);
        
        // linkedList.show();
    }

    @Test
    public void totalNode() {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.add(heroNode1);
        linkedList.add(heroNode5);
        linkedList.add(heroNode2);
        linkedList.add(heroNode4);
        linkedList.add(heroNode3);

        System.out.print(linkedList.totalNode());
    }

    @Test
    public void getById() {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.add(heroNode1);
        linkedList.add(heroNode5);
        linkedList.add(heroNode2);
        linkedList.add(heroNode4);
        linkedList.add(heroNode3);
        
        System.out.print(linkedList.getById(5));
    }

    @Test
    public void getAllId() {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.add(heroNode1);
        linkedList.add(heroNode5);
        linkedList.add(heroNode2);
        linkedList.add(heroNode4);
        linkedList.add(heroNode3);

        System.out.print(linkedList.getAllId());
    }
}
