package com.practice;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class DeleteMidStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack<Integer> myStack=new Stack<>();

            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);

            }
            Solution obj=new Solution();
            obj.deleteMid(myStack,sizeOfStack);

            while(!myStack.isEmpty())
            {
                System.out.print(myStack.peek()+" ");
                myStack.pop();
            }
            System.out.println();
        }


    }
}


class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){

        ArrayDeque<Integer> stk = new ArrayDeque<>();
        int m = sizeOfStack/2 ;

        int i = 0 ;
        while(!s.isEmpty())
        {
            stk.push(s.pop()) ;
            i++;

            if(i==m)
                s.pop();
        }

        while(!stk.isEmpty())
            s.push(stk.pop());

    }
}

