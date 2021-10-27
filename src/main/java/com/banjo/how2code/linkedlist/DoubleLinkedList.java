package com.banjo.how2code.linkedlist;

import java.util.ArrayList;
import java.util.List;

import com.banjo.how2code.utils.ItemNode;

/**
 * 双向链表，可以向前和向后查找，同时节点可以删除自身
 * 而单向链表只能向后查找，且需要借助辅助节点来进行节点的删除修改等
 */

public class DoubleLinkedList { 
    
    public ItemNode head = new ItemNode(0, "", "");

    public void add(ItemNode itemNode) {
        ItemNode temp = head;
        while (true) {
            if (temp.next == null) {
                temp.next = itemNode;
                itemNode.pre = temp;
                break;
            }
            temp = temp.next;
            
        }
    }

    public void deleteById(int id) {

        // 删除功能，只需要将当前节点的pre和next进行重置即可
        // 不需要借助辅助节点
        ItemNode item = getById(id);        
        item.pre.next = item.next;
        item.next.pre = item.pre;        

    }

    public ItemNode getById(int id) {
        ItemNode temp = head;
        // 先检查该id的节点是否存在
        checkWithId(id);
        while (true) {
            if (temp.next.id == id) {
                return temp.next;
            }
            temp =temp.next;
        }
    }

    public List<ItemNode> list() {
        ItemNode temp = head;
        List<ItemNode> iList = new ArrayList<>();
        if (head.next == null) {
            throw new RuntimeException("链表为空！");
        }
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
            iList.add(temp);
        }
        return iList;
    }

    public List<Integer> idList() {
        ItemNode temp = head;
        // 在去获取数据前，先查询链表是否为空
        if (head.next == null) {
            throw new RuntimeException("链表为空！");
        }
        List<Integer> ids = new ArrayList<>();
        while (true) {
            if (temp.next == null) {
                break;
            }
            ids.add(temp.id);
            temp = temp.next;
        }
        return ids;
    }

    public void checkWithId(int id) {
        List<Integer> ids = idList();
        if (!ids.contains(id)) {
            throw new RuntimeException("该id节点不存在，请重试！");
        } else {
            System.out.print("该节点存在！");
        }
    }
}
