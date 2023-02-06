package com.hillel.dolhunin.homework.homework16;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    private Node root;

    public Tree() {
        this.root = null;
    }

    public void add(int value) {
        Node node = new Node();
        node.setValue(value);
        if (root == null) {
            root = node;
        } else {
            Node currentNode = root;
            Node parentNode;
            while (true) {
                parentNode = currentNode;
                if (value == currentNode.getValue()) {
                    return;
                } else if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeft();
                    if (currentNode == null) {
                        parentNode.setLeft(node);
                        return;
                    }
                } else {
                    currentNode = currentNode.getRight();
                    if (currentNode == null) {
                        parentNode.setRight(node);
                        return;
                    }
                }
            }
        }
    }

    public void iterate() {
        Queue<Node> queue = new LinkedList<>();
        Node currentNode = root;
        do {
            System.out.println(currentNode.getValue());
            if (currentNode.getLeft() != null) {
                queue.offer(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.offer(currentNode.getRight());
            }
            if (!queue.isEmpty()) {
                currentNode = queue.poll();
            } else {
                break;
            }
        } while (true);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
