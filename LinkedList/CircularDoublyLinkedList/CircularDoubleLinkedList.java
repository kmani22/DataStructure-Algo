package CircularDoublyLinkedList;

public class CircularDoubleLinkedList {
    
    public CircularDoublyNode head;
    public CircularDoublyNode tail;
    int size;

    public void createCircularDoublyLinkedList(int data) {

        CircularDoublyNode node = new CircularDoublyNode();
        node.value = data;
        node.next = node;
        node.previous = node;
        size = 1;

        head = node;
        tail = node;
    
    }

    public void insertInCircularDoubleLinkedList(int data, int position) {

        // No circular linked list is present at this time
        if(head==null){
            createCircularDoublyLinkedList(data);
            return;
        }

        CircularDoublyNode node = new CircularDoublyNode();
        node.value = data;

        // Inserting a node at the very beginning of Circular Double Linked List
        if(position == 0){
            node.next = head;
            head.previous = node;
           
            tail.next = node;
            node.previous = tail;
            head = node;
            
        }
        // Inserting a node somewhere middle of circular double linked list
        else if(position >= size){
            
            node.previous = tail;
            tail.next = node;

            head.previous = node;
            node.next = head;

            tail = node;
        }
        // Inserting a node at the last of circular double linked list
        else{

            int index = 0;
            CircularDoublyNode traverseNode = head;

            while (index < position - 1) {
                traverseNode = traverseNode.next;
                index++;
            }

            node.next = traverseNode.next;
            traverseNode.next.previous = node;

            traverseNode.next = node;
            node.previous = traverseNode;

        }

        size++;   
    }

    public void traverseCircularDoubleLinkedList() {

        CircularDoublyNode traverseNode = head;
        do {

            System.out.print(traverseNode.value + "<->");
            traverseNode = traverseNode.next;
            
        } while (traverseNode != head);
        
        System.out.println("NULL");
    }

    public void reverseTraverseCircularDoubleLinkedList() {

        CircularDoublyNode traverseNode = tail;
        
        do {
            System.out.print(traverseNode.value + "<->");
            traverseNode = traverseNode.previous;
        } while (traverseNode != tail);

        System.out.println("NULL");
        
    }

    public void searchInCircularDoubleLinkedList(int valueToSearch) {
        if(head == null){
            System.out.println("No circular linked list is there !!");
            return;
        }

        CircularDoublyNode traverseNode = head;
        do {

            if(traverseNode.value == valueToSearch){
                System.out.println("Node is present in circular double linked list");
                return;
            }
            traverseNode = traverseNode.next;
            
        } while (traverseNode != head);

        System.out.println("Node is not present in Circular double linked list");

        
    }

    public void deleteFromCircularDoubleLinkedList(int position) {
        if(head == null){
            System.out.println("No Circular Double Linked list is present ");
            return;
        }
        // Deleting a node from very beginning 
        else if(position == 0){
            
            // Only one node is present in the linked list
            if(head.next == head){
                head.next = null;
                head.previous = null;

                head = null;
                tail = null;
            }
            // more than one node is present in the linked list
            else{

                head.next.previous = tail;
                tail.next = head.next;

                head = head.next;
            }

        }

        // deleting node from the last
        else if(position >= size){

            // if only single node is present in circular double linked list
            if(head.next == head){
                head.next = null;
                head.previous = null;

                head = null;
                tail = null;
            }
            // more than one node is present in the linked list
            else{

                tail.previous.next = head;
                head.previous = tail.previous;

                tail = tail.previous;
            }
        }

        // deleting node from the middle of the circular double linked list
        else{

            int index = 0;
            CircularDoublyNode traverseNode = head;

            while (index < position - 1) {
                traverseNode = traverseNode.next;
                index++;
            }

            traverseNode.next.next.previous = traverseNode;
            traverseNode.next = traverseNode.next.next;

        }

        size--;
        
    }
}
