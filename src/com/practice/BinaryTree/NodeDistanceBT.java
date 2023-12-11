package com.practice.BinaryTree;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class NodeDistanceBT {


        // finding all the nodes at a distance k from target
        public static List<Integer> distanceK(TreeNode root, int target, int K) {

            // list for answer storing
            List<Integer> ans = new ArrayList<>();

            // Queue for bfs
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);

            TreeNode need = null;

            //map to store parent of each node
            Map<TreeNode, TreeNode> m = new HashMap<>();

            while (!q.isEmpty()) {
                int s = q.size();

                // traversing the current level
                for (int i = 0; i < s; i++) {
                    TreeNode temp = q.poll();

                    // if target found then
//                    if (temp = target) {
//                        need = temp;
//                    }

                    if (temp.left != null) {
                        q.offer(temp.left);
                        m.put(temp.left, temp);
                    }

                    if (temp.right != null) {
                        q.offer(temp.right);
                        m.put(temp.right, temp);
                    }
                }
            }

//map to store occurrence of a node
//that is the node has taken or not
            Map<TreeNode, Integer> mm = new HashMap<>();
            q.offer(need);
            int c = 0;

            while (!q.isEmpty()) {
                int s = q.size();

                for (int i = 0; i < s; i++) {
                    TreeNode temp = q.poll();
                    mm.put(temp, 1);

                    if (c == K) {
                        ans.add(temp.val);
                    }

                    // moving left
                    if (temp.left != null && mm.getOrDefault(temp.left, 0) == 0) {
                        q.offer(temp.left);
                    }

                    // moving right
                    if (temp.right != null && mm.getOrDefault(temp.right, 0) == 0) {
                        q.offer(temp.right);
                    }

                    if (m.containsKey(temp) && mm.getOrDefault(m.get(temp), 0) == 0) {
                        q.offer(m.get(temp));
                    }
                }

                c++;
                if (c > K) {
                    break;
                }
            }

            return ans;
        }

//    public static ArrayList<Integer> distanceNodes(Node root , int target, int k){
//            ArrayList<Integer> list = new ArrayList<>();
//            findXDN(root,target,k,list);
//            Collections.sort(list);
//            return list;
//    }
//    static void findKDNdown(Node node, int k ,ArrayList<Integer> list){
//            if(node == null || k<0) return;
//            if(k==0){
//                list.add(node.data);
//                return;
//            }
//            findKDNdown(node.left,k-1,list);
//            findKDNdown(node.right,k-1,list);
//    }
//    static int findXDN(Node node, int target, int k, ArrayList<Integer> list){
//            if(node == null) return -1;
//            if(node.data == target){
//                findKDNdown(node,k,list);
//                return 0;
//            }
//
//            int ld = findKDN(node.left, target,k,list);
//            if(ld!=-1){
//                if(ld+1==k) list.add(node.data);
//                else findKDNdown(node.right,k-ld-2,list);
//                return ld+1;
//            }
//        int rd = findKDN(node.right, target,k,list);
//        if(rd!=-1){
//            if(rd+1==k) list.add(node.data);
//            else findKDNdown(node.left,k-rd-2,list);
//            return rd+1;
//        }
//        return -1;
//    }
//
//        public static void main(String[] args) {
//            TreeNode root = new TreeNode(20);
//            root.left = new TreeNode(7);
//            root.right = new TreeNode(24);
//            root.left.left = new TreeNode(4);
//            root.left.right = new TreeNode(3);
//            root.left.right.left = new TreeNode(1);
//          //  root.left.right.right = new TreeNode(4);
//         //   TreeNode target = root.left.right;
//            List<Integer> result = distanceK(root, 7, 2);
//            System.out.print("[");
//            for (int i = 0; i < result.size() - 1; i++) {
//                System.out.print(result.get(i) + ", ");
//            }
//            System.out.println(result.get(result.size() - 1) + "]");
//        }
}

