package com.hillel.dolhunin.homework.homework16;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(8);
        tree.add(5);
        tree.add(6);
        tree.add(3);
        tree.add(1);
        tree.add(7);
        tree.add(2);
        tree.add(9);

        tree.iterate();

        System.out.println(tree);


    }
}
