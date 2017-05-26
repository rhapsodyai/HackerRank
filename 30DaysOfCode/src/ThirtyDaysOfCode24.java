/**
 * Created by kiyomizumia on 2017/05/26.
 */
import java.io.*;
import java.util.*;

public class ThirtyDaysOfCode24 {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }

    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node tempHead = head;
        while(head.next != null) {
            if(head.data == head.next.data) {
                if(head.next.next != null)
                    head.next = head.next.next;
                else
                    head.next = null;
            } else {
                head = head.next;
            }
        }

        while(tempHead != null) {
            System.out.print(tempHead.data + " ");
            tempHead = tempHead.next;
        }
        return tempHead;
    }

    public static  Node insert(Node head,int data) {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;
        }
        return head;
    }

    public static void display(Node head) {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
    }
}

