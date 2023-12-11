package com.practice.BST;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

   public static class Node {
        int data;
        Node left ,right;
        public Node(int key) {
            this.data = key;
            this.left =null;
            this.right =null;
        }
    }

//    public static  class BinaryTree{
//       Node root;
//       public BinaryTree(){
//           this.root = null ;
//       }
//
//    }


    public static List<List<Integer>> levelOrder(Node root){

        Queue<Node> queue = new LinkedList<Node>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if(root == null)
        return wrapList;
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for (int i = 0; i < levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            wrapList.add(subList);

        }
        return wrapList;

    }

    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree();
        Node root= new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right  = new Node(7);


        System.out.println(root.data);
        System.out.println(levelOrder(root));
    }
}
