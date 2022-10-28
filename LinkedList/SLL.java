

public class SLL {
    
    public Node head;
    public Node tail;
    int size;

    public void CreateSSL(int data) {
        Node temp = new Node();
        temp.value = data;
        temp.next = null;
        head = temp;
        tail = temp;
        size = 1;
    }

    public void InsertInSSL(int data, int location) {

        // head is empty, creating first node
        if(head==null){
            CreateSSL(data);
            return;
        }

        Node tempNode = new Node();
        tempNode.value = data;
        // inserting at head : location 0
        if(location==0){
            tempNode.next = head;
            head = tempNode;
        }
        // inserting at last : location >=size 
        else if(location >=size){
            tempNode.next = null;
            tail.next = tempNode;
            tail = tempNode;
        }

        // inserting node somwhere middle : location < size
        else{
            int index = 0;
            Node temp = head;
            while (index < location - 1) {
                temp = temp.next;
                index ++;
            }
            Node nextNode = temp.next;
            temp.next = tempNode;
            tempNode.next =nextNode;   
        }

        size++;

    }

    public void deleteFromSLL(int location) {

        if(head==null){
            System.out.println("Linked List is empty !!");
            return;
        }

        // Deleting a head node
        if(location==0){
            head = head.next;
            size--;

            if(size==0) head=tail=null;
        }
        // Deleting node from last
        else if(location >= size){

            Node temp = head;
            int index = 0;
            while (index < size - 1) {
                temp = temp.next;
                index++;
            }

            if(temp==head){
                head=tail=null;
                size--;
                return;
            }

            temp.next = null;
            tail = temp;
            size--;
        }
        // Inserting node somewhere middle
        else{

            Node temp = head;
            int index = 0;
            while (index < location - 1) {
                temp = temp.next;
                index++;
            }

            temp.next = temp.next.next;
            size--;

        }
        
    }

    public void traverseSLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        
    }
}

