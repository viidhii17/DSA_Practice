package com.practice.BST;

public class KthElement {
   static int count = 0;
   static int ans = 0;

    static Node insertBST(Node root,int val)
    {
        if(root==null)
        {
            return new Node(val);
        }
        if(val<root.data)
        {
            root.left=insertBST(root.left,val);
        }
        else
        {
            root.right=insertBST(root.right,val);
        }
        return root;
    }

    public static int kthLargest(Node root, int K) {
        //Your code here
        revInorder(root, K);
        return ans;

    }

    static void revInorder(Node root, int K) {
        if (root == null) return;
        revInorder(root.right, K);
        count++;
        if (count == K) {
            ans = root.data;
            return;
        }
        revInorder(root.left, K);
    }

    public static void main(String[] args) {

        int arr[]={10,40,45,20,25,30,50},i;

        int k=3;
        Node root=null;
        for(i=0;i<7;i++)
        {
            root=insertBST(root,arr[i]);
        }
        System.out.println(insertBST(root,3));
    }
}