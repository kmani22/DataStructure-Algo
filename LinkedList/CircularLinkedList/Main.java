public class Main {
    
    public static void main(String[] args) {
        
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        cll.CreateCircularSinglyLinkedList(5);
        cll.insertInCircularLinkedList(10, 1);
        cll.insertInCircularLinkedList(15  , 2);
        cll.insertInCircularLinkedList(20, 3);
        cll.insertInCircularLinkedList(25, 4);
        cll.insertInCircularLinkedList(30, 5);
        System.out.println();
        cll.traverseCircularLinkedList();
        cll.deleteFromCircularLinkeList(100);
        System.out.println();
        cll.traverseCircularLinkedList();

    }


}
