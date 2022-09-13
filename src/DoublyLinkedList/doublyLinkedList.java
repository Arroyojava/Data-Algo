package DoublyLinkedList;

public class doublyLinkedList<T extends Comparable<T>> {

    private Node<T> head;
    private Node<T> tail;

    public void insert(T data) {

        Node<T> newNode = new Node<>(data);

        // This is the first item in the linked list
        if (tail == null) {
            // Both of the pointers are pointing to the new node
            tail = newNode;
            head = newNode;
        } else {
            // We have to insert the new item to the end of the list
            // We have to manipulate the tail node and its references in O(1)
            newNode.setPreviousNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    // Traverse the list forward
    public void traverseForward() {

        Node<T> actualNode = head;

        while (actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

    public void traverseBackward() {

        Node<T> actualNode = tail;

        while (actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getPreviousNode();

        }
    }
}
