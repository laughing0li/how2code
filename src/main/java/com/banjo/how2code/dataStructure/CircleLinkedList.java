package com.banjo.how2code.dataStructure;
/**
 * 环形链表
 * 约瑟夫问题，环形链表的出圈顺序
 * 几个小孩围成一个环形，从第k个人开始，每个n下 一个小孩出列
 * 算出小孩出列的顺序
 */
import java.util.ArrayList;
import java.util.List;

import com.banjo.how2code.utils.HeroNode;

public class CircleLinkedList {

    private HeroNode first = null;

    public void addNode(Integer numbers) {

        // 创建一个辅助节点
        HeroNode currentNode = null;

        if (!(numbers instanceof Integer)) {
            throw new RuntimeException("请输入数字！");
        } else if (Math.round(numbers) != numbers) {
            throw new RuntimeException("节点个数应该为整数！");
        } else if (numbers < 2) {
            throw new RuntimeException("请输入大于2的数字！");
        }
        for (int i = 1; i <= numbers; i++) {
            HeroNode newNode = new HeroNode(i, "", "hero");
            // 当i等于1的时候，是第一个节点，就将其值赋给first节点，
            // 并将first节点的next指向自己形成环状
            if (i == 1) {
                first = newNode;
                first.next = first;
                // 让辅助节点从first节点开始
                currentNode = first;
            } else {
                // 当i大于1开始，先将辅助节点的next指向需要添加的节点
                currentNode.next = newNode;
                // 然后将需要添加的节点的next指向first形成环形
                newNode.next = first;
                // 最后将辅助节点挪到添加的节点
                currentNode = newNode;
            }

        }

    }

    public boolean isFull() {
        HeroNode tempNode = first;
        while (true) {
            if (tempNode.next == first) {
                return true;
            }
            tempNode = tempNode.next;
        }
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else return false;
    }

    public List<HeroNode> list() {
        if (isEmpty()) {
            throw new RuntimeException("该环形链表为空！");
        }
        HeroNode temp = first;
        List<HeroNode> nodes = new ArrayList<>();
        // 先将第一个节点加入到list
        nodes.add(first);
        while (true) {
            if (temp.next == first) {
                break;
            }
            temp = temp.next;
            nodes.add(temp);
        }
        return nodes;
    }

    public HeroNode getById(int id) {
        if (isEmpty()) {
            throw new RuntimeException("环形链表为空！");
        }
        // 如何链表不为空，就创建一个临时的节点
        HeroNode tempNode = first;

        while (true) {
            if (tempNode.id == id) {
                break;
            }
            tempNode = tempNode.next;
        }
        return tempNode;

        
    }

    /**
     * 
     * @param startNo 表示从链表的第几个节点开始
     * @param countNum 表示数几下
     * @param num   表示一共有多少个节点
     */
    public void count(int startNo, int countNum, int num) {
        if (isEmpty() || startNo < 1 || startNo > num) {
            System.out.print("参数错误！");
            return;
        }
        // 创建辅助节点
        HeroNode helper = first;
        HeroNode startNode = getById(startNo);
        while (true) {
            // 将helper指向环形链表的最后一个节点
            if (helper.next == first) {
                break;
            }
            helper = helper.next;
        }
         
    }

}
