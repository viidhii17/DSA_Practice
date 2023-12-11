package com.practice.BST;

public class BuildABST {

    static class Node {
        int data;
        Node left;
        Node right ;
        Node(int data){
            this.data = data ;
        }
    }
    public static Node insert(Node root,int val ){
            if (root == null) root = new Node(val);
            if (root.data > val) root.left = insert(root.left, val);
            if (root.data < val) root.right = insert(root.right, val);

            return root;
    }

    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node delete(Node root, int val){
        if (root.data < val){
            root.right = delete(root.right,val);
        }
        else if (root.data > val){
            root.left = delete(root.left ,val);
        }
        else{
            //case1
            if(root.left == null && root.right == null){
                return null;
            }
            //case2
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            //case3
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left ;
        }
        return root;
    }

    public static boolean isValidBST(Node root, Node min, Node max)
    {
        if (root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }
        return  isValidBST(root.left,min,root) &&
                isValidBST(root.right,root,max);
    }

    public static void main(String[] args) {
       // int values[] = {5,1,3,4,2,7};
        int values[] = {1,2,1,1};
        Node root = null;

        for (int i = 0; i < values.length ; i++) {
            root = insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

//        root = delete(root,1);
//        System.out.println();
//        inorder(root);
        if (isValidBST( root,null,null)){
            System.out.println("valid");
        }else {
            System.out.println("not valid");
        }
    }


}
