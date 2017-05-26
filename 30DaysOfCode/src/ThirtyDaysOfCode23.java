/**
 * Created by kiyomizumia on 2017/05/25.
 */

import java.io.*;
import java.util.*;

public class ThirtyDaysOfCode23 {

    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    static void levelOrder(Node root) {
        //Write your code here
        Queue<Node> l = new LinkedList<Node>();

        if (root == null)
            return;

        // enqueue current root
        l.add(root);

        // while there are nodes to process
        while (!l.isEmpty()) {
            // dequeue next node
            Node temp = l.remove();
            System.out.print(temp.data + " ");

            // enqueue child elements from next level in order
            if (temp.left != null) {
                l.add(temp.left);
            }
            if (temp.right != null) {
                l.add(temp.right);
            }
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
