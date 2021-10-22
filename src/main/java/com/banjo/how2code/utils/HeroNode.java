package com.banjo.how2code.utils;

/**
 * HeroNode用于单链表的操作使用
 *
 * */

public class HeroNode {
    public int id;
    public String name;
    public String nickName;
    public HeroNode next; // next表示该节点指向的下一个节点

    public HeroNode(int id, String name, String nickName) {
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