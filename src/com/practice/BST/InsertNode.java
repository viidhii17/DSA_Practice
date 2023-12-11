package com.practice.BST;

class Node{
    int data;
    Node left ,right;

    public Node(int key) {
            this.data = key;
            this.left =null;
            this.right =null;
        }
//static Node buildTree(String str){
//        if(str.length() == 0 || str.equals("N"))return null
//}


public class InsertNode {

    Node insert(Node root, int Key) {

        if (root == null) root = new Node(Key);
        if (root.data > Key) root.left = insert(root.left, Key);
        if (root.data < Key) root.right = insert(root.right, Key);

        return root;
    }
}
}
