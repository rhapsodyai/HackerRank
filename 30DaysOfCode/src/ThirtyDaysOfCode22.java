/**
 * Created by kiyomizumia on 2017/05/25.
 */
import java.util.*;
import java.io.*;

public class ThirtyDaysOfCode22 {
    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    public static int log2(int n){
        if(n <= 0) throw new IllegalArgumentException();
        return 31 - Integer.numberOfLeadingZeros(n);
    }

    public static int max(int x, int y) {
        if(x > y) {
            return x;
        } else {
            return y;
        }
    }

    static int height = 1;
    public static int getHeight(Node root) {
        //Write your code here
        if(root.left != null && root.right != null)
            return 1 + max(getHeight(root.left),getHeight(root.right));
        else if(root.left != null)
            return 1+ getHeight(root.left);
        else if(root.right != null)
            return 1+ getHeight(root.right);
        return 0;
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
        int height=getHeight(root);
        System.out.println(height);
    }
}
