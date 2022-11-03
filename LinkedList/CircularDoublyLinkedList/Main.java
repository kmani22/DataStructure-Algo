package CircularDoublyLinkedList;

import java.util.HexFormat;

public class Main {
    public static void main(String[] args) {
        
        CircularDoubleLinkedList cdll = new CircularDoubleLinkedList();
        cdll.createCircularDoublyLinkedList(100);
        cdll.insertInCircularDoubleLinkedList(200, 1);
        cdll.insertInCircularDoubleLinkedList(300, 2);
        cdll.insertInCircularDoubleLinkedList(400, 3);
        cdll.insertInCircularDoubleLinkedList(500, 4);

        cdll.traverseCircularDoubleLinkedList();

        // cdll.insertInCircularDoubleLinkedList(1, 5);
        // cdll.traverseCircularDoubleLinkedList();
        cdll.deleteFromCircularDoubleLinkedList(3);
        cdll.traverseCircularDoubleLinkedList();

    }
}
