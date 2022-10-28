import javax.lang.model.util.ElementScanner14;

public class SinglyLinkedList {
    
    public Node head;
    public Node tail;
    public int size;

    public void CreateSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        
        //check if head is null
        if(head == null){
            CreateSinglyLinkedList(nodeValue);
            return;
        }

        Node tempNode = new Node();
        tempNode.value = nodeValue;

        //inserting at first node
        if(location == 0){
            tempNode.next = head;
            head = tempNode;
        }
        // inserting at last node
        else if(location >= size){
            tempNode.next = null;
            tail.next = tempNode;
            tail = tempNode;
        }
        // inserting somwhere middle of linked list
        else{

            Node temporaryNode = head;
            int index = 0;
            while(index < location - 1){
                temporaryNode = temporaryNode.next;
                index++;
            }

            Node nextNode = temporaryNode.next;
            temporaryNode.next = tempNode;
            tempNode.next = nextNode;


        }

        size++;
        
    }

    public void traverseLinkedList() {

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.print("NULL");
        
    }


    public boolean searchInLinkedList(int valueToSearch) {

        if(head==null){
            System.out.println("Node is empty !!");
        }else{

            Node tempNode = head;
            while (tempNode != null) {

                if(tempNode.value == valueToSearch){
                    return true;
                }
                tempNode = tempNode.next;
                
            }
        }

        return false;

    }


    public void deletionOfNode(int location) {

        // Check if linked list exist or not
        if(head == null){
            System.out.println("The single linked list does not exist");
            return;
        }
        // Node to delete : FIRST
        else if(location == 0){

            head = head.next;
            size--;

            if(size == 0) head=tail=null;
        }
        // Node to delete : LAST
        else if(location >= size){
            Node tempNode = head;
            int index = 0;
            while (index < size - 1) {
                tempNode = tempNode.next;
                index++;
            }
            // only one element is present
            if(tempNode == head){
                tail = head = null;
                size--;
                return;
            }

            tempNode.next = null;
            tail = tempNode;
            size--;
        }
        // Node to delete : AT ANY LOCATION
        else{
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }

            tempNode.next = tempNode.next.next;
            size--;
        }
        
    }

    public void deleteEntireLinkedList() {
        head = tail = null;
        System.out.println("Entire linked list get deleted !!");
        
    }


}
