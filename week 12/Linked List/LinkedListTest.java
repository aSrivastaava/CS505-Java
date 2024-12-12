public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addNode(new Node("Alice"));
        list.addNode(new Node("Bob"));
        list.addNode(new Node("Charlie"));
        System.out.println("Initial LinkedList:");
        list.printList();

        System.out.println("After inserting 'David' at index 1:");
        list.insertBefore(1, new Node("David"));
        list.printList();

        System.out.println("Index of 'Charlie': " + list.indexOf("Charlie"));
        System.out.println("Index of 'Eve': " + list.indexOf("Eve"));

        System.out.println("After removing node at index 2:");
        list.removeNodeAt(2);
        list.printList();
    }
}
