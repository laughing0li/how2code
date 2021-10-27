package com.banjo.how2code.linkedlist;

import java.util.ArrayList;
import java.util.List;

import com.banjo.how2code.utils.HeroNode;

/**
 *
 * 单链表的创建与操作
 * 1. 先添加一个head头结点，代表单链表的头
 * 2. 后面创建的每一个节点，直接加入到链表的最后
 * 3. 遍历需要创建一个辅助变量进行遍历
 * */

public class SingleLinkedList {
    // 初始化一个头结点
    public HeroNode head = new HeroNode(0, "", "");

    public void add(HeroNode heroNode) {
        // 生成一个临时的变量，从head开始
        HeroNode temp = head;
        // 让临时变量遍历到链表的尾部。当该节点的next为null的时候，表示到达了尾部
        while(temp.next != null) {
            if (temp.next.id == heroNode.id) {
                throw new RuntimeException("该英雄已经存在！");
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    // 根据id的大小顺序的加入节点
    public void addById(HeroNode heroNode) {
        HeroNode temp = head;
        // flag用于表示我们是否找到了需要插入的节点的位置
        boolean flag = false;

        while (true) {
            // 首先进行遍历，判断是否到达了链表的最后一个位置
            if (temp.next == null) {
                
                break;
            }
            // temp下一个节点的id和需要加入的节点id相同，说明一件存在
            if (temp.next.id == heroNode.id) {
                flag = true;
                break;
            }
            // 当temp.next.no大于了新添加的hero，那么就表示该新添加的hero就在
            // temp.next的前面
            if (temp.next.id > heroNode.id) {
                break;
            } 
            // 将temp辅助节点往后移动
            temp = temp.next;
        }
        if (flag) {
            throw new RuntimeException("该英雄已存在!");
        } else {
            // 先将加入的节点的next指向 临时节点的下一个
            heroNode.next = temp.next;
            // 将临时节点的下一个节点指向加入的节点。这就完成了新添加的节点的动作
            temp.next = heroNode;
        }
    }

    // 根据hero的id来进行更新
    public void updateById(HeroNode heroNode) {
        HeroNode temp = head;
        List<Integer> ids = getAllId();
        // 在更新该id的节点前，先要检查该节点是否存在
        if (!ids.contains(heroNode.id)) {
            throw new RuntimeException("id为 " + heroNode.id + " 的节点不存在，请重试！");
        }
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.id == heroNode.id) {
                temp.next.name = heroNode.name;
                temp.next.nickName = heroNode.nickName;
                break;
            }
            temp = temp.next;
        }
    }

    // 根据id来对节点进行删除
    public void deleteById(int id) {
        HeroNode temp = head;
        List<Integer> ids = getAllId();
        // 在删除该id的节点前，先要检查该节点是否存在
        if (!ids.contains(id)) {
            throw new RuntimeException("id为 " + id + " 的节点不存在，请重试！");
        }
        HeroNode delNode = getById(id);
        while(true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.id == delNode.id) {
                temp.next = delNode.next;
                break;
            }
            temp = temp.next;
        }
    }

    public HeroNode getById(int id) {
        HeroNode temp = head;
        List<Integer> ids = getAllId();
        // 在获取该id的节点前，先要检查该节点是否存在
        if (!ids.contains(id)) {
            throw new RuntimeException("id为 " + id + " 的节点不存在，请重试！");
        }
        while (true) {

            if (temp.next == null) {
                break;
            }
            if (temp.next.id == id) {
                break;
            }
            temp = temp.next;
        }
        return temp.next;
    }

    // 获取到链表里的所有节点的id
    public List<Integer> getAllId() {
        HeroNode temp = head;
        List<Integer> list = new ArrayList<>();
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
            list.add(temp.id);
        }
        return list;
    }

    public Integer totalNode() {
        HeroNode temp = head;
        int count = 0;
        while (true) {
            if (temp.next == null) {
                
                break;
            }
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void show() {
        HeroNode temp = head;
        List<HeroNode> nodes = new ArrayList<>();
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
            nodes.add(temp);
        }
        System.out.print(nodes.toString());
    }

}
