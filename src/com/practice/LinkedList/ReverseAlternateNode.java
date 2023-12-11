package com.practice.LinkedList;

public class ReverseAlternateNode {

//    public static void rearrange(Node odd)
//    {
//        // add your code here
//        Node head = odd;
//        Node even = odd.next;
//        Node HeadOfEven = even;
//
//        while(even != null && even.next != null){
//            odd.next = odd.next.next;
//            even.next = even.next.next;
//            odd = odd.next;
//            even = even.next;
//        }
//        Node reverseEvenElement = reverse(HeadOfEven);
//        odd.next = reverseEvenElement;
//    }
//    public static Node reverse(Node head){
//        Node prev = null;
//        Node curr=head;
//        while(curr!=null){
//            Node next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
}
