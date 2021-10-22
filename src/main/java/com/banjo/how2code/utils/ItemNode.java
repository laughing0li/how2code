package com.banjo.how2code.utils;

/**
 * 用于DoubleLinkedList操作
 */

public class ItemNode {
    
    public int id;
    public String name;
    public String nickName;
    public ItemNode next; // next表示该节点指向的下一个节点
    public ItemNode pre; // pre表示指向该节点的上一个节点

    public ItemNode(int id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}