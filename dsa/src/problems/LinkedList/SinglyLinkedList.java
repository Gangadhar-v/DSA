package problems.LinkedList;

import java.util.HashSet;

public class SinglyLinkedList {

    Node head;

    public void insert(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void printLinkedList(){

        Node current = head;

        while(current.next != null){
            System.out.println(current.data);
            current = current.next;
        }
    }


    public void removeDuplicates(){

        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;

        while(current.next != null){

            if(set.contains(current.data)){
                prev.next = current.next;

            }else{
                set.add(current.data);
                prev = current;
            }

            current = current.next;
        }
    }

    public int length(){
        int length = 0;
        Node current = head;

        while(current.next != null){
            length++;
            current = current.next;
        }
        return length;
    }


    //Swap the kth node form the start and end of the linkedList;
    public void swapKthNode(int k){

        //return first the node
        int n = length();
        Node kthStart = head;
        Node kthEnd = head;


        int index = 1;
        while(index<k){
            kthStart = kthStart.next;
            index++;
        }

        for(int j = 1;j<n-k+1;j++){
            kthEnd = kthEnd.next;
        }

        int temp = kthStart.data;
        kthStart.data = kthEnd.data;
        kthEnd.data = temp;

    }

    //delete node without accessing head
    public void deleteNode(Node node){

        node.data = node.next.data;
        node.next = node.next.next;

    }
    public static void main(String args[]){

        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(20);
        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.insert(30);

//        linkedList.printLinkedList();
//        System.out.println("Before removing duplicates elements form the linked list:");
//        linkedList.removeDuplicates();
//        System.out.println("After removing duplicate from the linked list");
//        linkedList.printLinkedList();
//        linkedList.swapKthNode(1);
//        linkedList.printLinkedList();
         linkedList.deleteNode(linkedList.head.next.next);
         linkedList.printLinkedList();



    }

}
