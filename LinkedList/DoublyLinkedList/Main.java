public class Main {
    

    public static void main(String[] args) {
        
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDoubleLinkedList(1);
        dll.insertIntoDoubleLinkedList(2 , 1);
        dll.insertIntoDoubleLinkedList(3, 2);
        dll.insertIntoDoubleLinkedList(4, 3);
        dll.insertIntoDoubleLinkedList(5, 4);

        dll.traversDoubleLinkedList();
        // dll.insertIntoDoubleLinkedList(1000, 4);
        // dll.reverseTraverseDoubleLinkedList();;
        // dll.searchInDoubleLinkedList(100);
        dll.deletionFromDoubleLinkedList(4);
        dll.traversDoubleLinkedList();
    }
}
