import javax.management.ValueExp;

public class DoublyLinkedList {
    
    public DoubleNode head;
    public DoubleNode tail;
    public int size;

    public void createDoubleLinkedList(int data) {

        DoubleNode node = new DoubleNode();
        node.value = data; 
        node.next = null;
        node.previous = null;

        head = node;
        tail = node;
        size = 1;
    }

    public void insertIntoDoubleLinkedList(int nodeValue, int position) {

        // No double linked list is present
        if(head == null){
            createDoubleLinkedList(nodeValue);
            return;
        }

        DoubleNode node = new DoubleNode();
        node.value = nodeValue;

        // CASE 1 : Inserting node at first position
        if(position == 0){

            node.next = head;
            node.previous = null;

            head.previous = node;
            head = node;
        }

        // CASE 2: Inserting node at last position
        else if(position >= size){

            node.next = null;
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        // CASE 3: Inserting node somwhere middle of double linked list
        else{

            int index = 0;
            DoubleNode traverseNode = head;

            while (index < position - 1) {
                traverseNode = traverseNode.next;
                index++;
            }

            DoubleNode nextNode = traverseNode.next;
            traverseNode.next = node;
            node.previous = traverseNode;
            node.next = nextNode;
            nextNode.previous = node;
        }

        // Increment the size of the double linked list
        size++;
    }

    public void traversDoubleLinkedList() {

        DoubleNode traverseNode = head;
        while (traverseNode != null) {

            System.out.print(traverseNode.value + "<->");
            traverseNode = traverseNode.next;
        }

        System.out.println("NULL");
        
    }

    public void reverseTraverseDoubleLinkedList() {

        DoubleNode reverseTraverse = tail;
        while (reverseTraverse != null) {

            System.out.print(reverseTraverse.value + "<->");
            reverseTraverse = reverseTraverse.previous;
        }
        
        System.out.println("NULL");
        
    }

    public void searchInDoubleLinkedList(int valueToSearch) {

        DoubleNode traverseNode = head;
        while (traverseNode != null) {
            
            if(traverseNode.value == valueToSearch){
                System.out.println("Node is present !!");
                return;
            }

            traverseNode = traverseNode.next;
        }

        System.out.println("No Node is present with such value !!");
        
    }

    public void deletionFromDoubleLinkedList(int position) {

        // If linked list is empty
        if(head == null){
            System.out.println("No Double Linked List is present !!");
            return;
        }
        //CASE 1:  Deleting node from the front
        else if(position == 0){

            // CASE a: if only single node is present
            if(head.next == null){

                head = null;
                tail = null;
            }
            // CASE b: multiple nodes are present
            else{   
                head = head.next;
                head.previous = null;
            }
        }
        // CASE 2 : Deleting node from the last
        else if(position >= size){
            // CASE a : only single node is present
            if(head.next==null){
                head = null;
                tail = null;
            }
            // CASE b : multiple nodes are present
            else{
                tail = tail.previous;
                tail.next = null;
            }
        }
        // CASE 3 : Deleting node from middle 
        else{
            int index = 0;
            DoubleNode traverseNode = head;

            while (index < position - 1) {
                traverseNode = traverseNode.next;
                index++;
            }

            

            traverseNode.next.next.previous = traverseNode;
            traverseNode.next = traverseNode.next.next;

            // Somehow better approach

            // traverseNode.next = traverseNode.next.next;
            // traverseNode.next.previous = traverseNode;
        }

        size--;
    }

    public void deleteEntireDoubleLinkedList() {

        DoubleNode traverseNode = head;
        while (traverseNode != null) {

            traverseNode.previous = null;
            traverseNode = traverseNode.next;
        }

        head = null;
        tail = null;
        
    }

}
