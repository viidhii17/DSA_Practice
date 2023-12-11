package com.practice.BST;

public class SearchInBST {

    public TreeNode searchBST(TreeNode root , int data){
        while(root!= null && root.data != data){
            root = data <root.data?root.left:root.right ;
        }
        return root ;
    }
}
