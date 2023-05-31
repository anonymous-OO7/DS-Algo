

    class Node{

        int data;
        Node next;
    
        Node( int data){
        this.data = data;
        }
    }

public class LinkedList {


   // create an object of Node class
  // represent the head of the linked list
  Node head;

    public static void main(String [] args){

        LinkedList linkedList = new LinkedList();
        Node n1 = new Node(10);
        Node n2  = new Node(20);
        Node n3 = new Node(30);


        linkedList.head = n1;
        n1.next = n2;
        n2.next = n3;


        System.out.println(n2.data + " --N1 NEXTT");


    }
    
}
