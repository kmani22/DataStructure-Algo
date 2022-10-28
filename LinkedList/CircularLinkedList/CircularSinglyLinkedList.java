public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;
    

    public void CreateCircularSinglyLinkedList(int data) {

        Node temp = new Node();
        temp.value = data;
        temp.next = temp; //assign to itself coz of circular LL

        head = temp;
        tail = temp;
        size = 1;
        
    }

    public void insertInCircularLinkedList(int data, int position) {

        // No circular LL is present, head is null
        if(head == null){
            CreateCircularSinglyLinkedList(data);
            return;
        }

        Node temp = new Node();
        temp.value = data;

        // CASE 1: Inserting at head 
        if(position == 0){
            temp.next = head;

            Node traverseNode = head;
            while(traverseNode.next != head){
                traverseNode = traverseNode.next;
            }

            traverseNode.next = temp;
            head = temp;

            // BETTER APPROACH
            // temp.next = head;
            // head = temp;
            // tail.next = head;


        }
        // CASE 2 : Inserting at last 
        else if(position >= size){

            Node traverseNode = head;
            while (traverseNode.next != head) {
                traverseNode = traverseNode.next;
            }

            traverseNode.next = temp;
            temp.next = head;
            tail = temp;
            
            // BETTER APPROACH
            // tail.next = temp;
            // tail = temp;
            // tail.next = head;
        }
        // CASE 3: Inserting at the middle of CLL
        else{

            Node traversNode = head;
            int index = 0;
            while (index < position - 1) {
                traversNode = traversNode.next;
                index++;
            }

            Node nextNode = traversNode.next;
            traversNode.next = temp;
            temp.next = nextNode;
        }

        size++;
        
    }

    public void traverseCircularLinkedList() {

        Node traverseNode = head;

        do{
            System.out.print(traverseNode.value + "->");
            traverseNode = traverseNode.next;
        }while(traverseNode != head);
        
        System.out.print("NULL");

    }

    public void searchInCircularLinkedList(int valueToSearch) {

        Node traverseNode = head;
        do{
            if(traverseNode.value == valueToSearch){
                System.out.println("DATA is present in Circular Linked List ");
                return;
            }
            traverseNode = traverseNode.next;
        }while(traverseNode != head);
        

        System.out.println("NO DATA is present in Circular Linked List ");
    }

    public void deleteFromCircularLinkeList(int position) {

        if(head == null){
            System.out.println("NO CIRCULAR LINKED LIST IS PRESENT ");
            return;
        }

        // CASE 1: Deleting node at zero position
        if(position == 0){

            // CASE a: if only single node is present
            if(head.next == head){
                head.next = null;
                head = null;
                tail = null;
            }
            // CASE b: if multiple nodes are present in Circular linked list
            else{
                tail.next = head.next;
                head = head.next;
            }
        }
        // CASE 2 : Deleting node from the last
        else if (position >= size){

            // CASE a : if only single node is present
            if(head.next == head){
                head.next = null;
                head = null;
                tail = null;
            }
            // CASE b : if multiple nodes are present in Circular linked list
            else{

                int index = 1;
                Node travserNode = head;
                while(index < size - 1){
                    travserNode = travserNode.next;
                    index ++;
                }

                travserNode.next = head;
                tail = travserNode;
            }
        }
        // CASE 3 : Deleting node from the middle of Circular Linked List
        else{

            int index = 0;
            Node traverseNode = head;
            while (index < position - 1) {

                traverseNode = traverseNode.next;
                index ++;
            }

            traverseNode.next = traverseNode.next.next;
        }

        size--;
    }

    public void deleteEntireCircularSingleLinkedList() {

        if(head == null){
            System.out.println("Circular Single Linked list doesn't exist ");
        }

        head = null;
        tail.next = null;
        tail = null;

        System.out.println("Circular Singular Linked List has been deleted !!");
    }
}
