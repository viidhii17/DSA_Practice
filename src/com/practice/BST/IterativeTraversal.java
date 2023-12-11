package com.practice.BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int key) {
        this.data = key;
        this.left = null;
        this.right = null;
    }
}

public class IterativeTraversal {
    static ArrayList<Integer> preOrderTrav(TreeNode curr) {
        ArrayList<Integer> preOrder = new ArrayList<Integer>();

        if (curr == null) return preOrder;

        Stack<TreeNode> s = new Stack<>();
        s.push(curr);

        while (!s.isEmpty()) {
            TreeNode topNode = s.peek();
            preOrder.add(topNode.data);
            s.pop();
            if (topNode.right != null)
                s.push(topNode.right);
            if (topNode.left != null)
                s.push(topNode.left);

        }
        return preOrder;

    }
    static ArrayList<Integer> postOrderTrav(TreeNode curr2){
        ArrayList<Integer> postOrder = new ArrayList<Integer>() ;

        if(curr2 == null)return postOrder;

        Stack <TreeNode> s1 = new Stack<>();
        Stack <TreeNode> s2 = new Stack<>();
        s1.push(curr2);

        while(!s1.isEmpty()) {
            curr2 = s1.peek();
            s1.pop();
            s2.push(curr2);
            if (curr2.right != null)
                s1.push(curr2.right);
            if (curr2.left != null)
                s2.push(curr2.left);
        }while(!s2.isEmpty()){
            postOrder.add(s2.peek().data);
            s2.pop();
        } return postOrder;

    }

    static List<Integer> postOrderTrav2(TreeNode root) {
    List<Integer>list = new ArrayList<Integer>();

    Stack<TreeNode> stk = new Stack<TreeNode>();
    // Check for empty tree
        if (root == null)
            return list;

        stk.push(root);
    TreeNode prev = null;
        while (!stk.isEmpty()) {
        TreeNode current = stk.peek();
        if (prev == null || prev.left == current || prev.right == current) {
            if (current.left != null)
                stk.push(current.left);
            else if (current.right != null)
                stk.push(current.right);
            else {
                stk.pop();
                list.add(current.data);
            }
        }
        else if (current.left == prev) {
            if (current.right != null)
                stk.push(current.right);
            else {
                stk.pop();
                list.add(current.data);
            }
        }
        else if (current.right == prev) {
            stk.pop();
            list.add(current.data);
        }
        prev = current;
    }
        return list;
}


    static ArrayList < Integer > inOrderTrav(Node curr) {
        ArrayList < Integer > inOrder = new ArrayList < > ();
        Stack < Node > s = new Stack < > ();
        while (true) {
            if (curr != null) {
                s.push(curr);
                curr = curr.left;
            } else {
                if (s.isEmpty()) break;
                curr = s.peek();
                inOrder.add(curr.data);
                s.pop();
                curr = curr.right;
            }
        }
        return inOrder;
    }



    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right  = new TreeNode(7);

        ArrayList<Integer> preOrder = new ArrayList<>();
        preOrder = preOrderTrav(root);
        System.out.println("Preorder is - ");
        for (int i = 0; i <preOrder.size() ; i++) {
            System.out.println(preOrder.get(i)+" ");

       }
        ArrayList<Integer> postOrder = new ArrayList<>();
        preOrder = postOrderTrav(root);
        System.out.println("Postorder is - ");
        for (int i = 0; i <postOrder.size() ; i++) {
            System.out.println(postOrder.get(i)+" ");

        }
   }
}
