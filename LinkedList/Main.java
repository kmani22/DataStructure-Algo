public class Main {
    
    public static void main(String[] args) {
        
        // SinglyLinkedList ll = new SinglyLinkedList();
        // ll.CreateSinglyLinkedList(100);
        // ll.insertInLinkedList(1, 1);
        // ll.insertInLinkedList(2, 2);
        // ll.insertInLinkedList(3, 3);
        // ll.insertInLinkedList(4, 4);
        // ll.insertInLinkedList(5,5);
        // ll.insertInLinkedList(6, 6);
        // ll.insertInLinkedList(7, 7);
        // ll.traverseLinkedList();
        // ll.deletionOfNode(0);
        // ll.traverseLinkedList();
        // System.out.println(ll.searchInLinkedList(89));

                
         SLL ll = new SLL();
        ll.CreateSSL(100);
        ll.InsertInSSL(1, 1);
        ll.InsertInSSL(2, 2);
        ll.InsertInSSL(3, 3);
        ll.InsertInSSL(4, 4);
        ll.InsertInSSL(5,5);
        ll.InsertInSSL(6, 6);
        ll.InsertInSSL(7, 7);
        ll.traverseSLL();
        System.out.println();
        ll.deleteFromSLL(3);
        ll.traverseSLL();
    }



}
