package LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    // This is the head node or root node
    private Node<T> root;
    private int numOfItems;


    public void reverse(){

        Node<T> currentNode = root;
        Node<T> previousNode = null;
        Node<T> nextNode = null;

        while (currentNode != null){
            nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        this.root = previousNode;
    }

    public Node<T> getMiddleNode() {

        Node<T> slow = this.root;
        Node<T> fast = this.root;

        // O(n/2) = O(n)
        while (fast.getNextNode() != null && fast.getNextNode().getNextNode() != null) {
            slow = slow.getNextNode();
            fast = fast.getNextNode().getNextNode();
        }
        return slow;
    }


    @Override
    public void insert(T data) {

        if (root == null) {
            // This is the first item in the linked list
            root = new Node<>(data);
        } else {
            // We know that this is not the first item in the linked list
            insertBeginning(data);
        }

    }

    // We have to update the references in O(1)
    private void insertBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;

    }

    // We have to start with the root node
    // First we have to find the last node in O(n)
    private void insertEnd(T data, Node<T> node) {
        // This is when we are looking for the last node O(n)
        if (node.getNextNode() != null)
            insertEnd(data, node.getNextNode());
        else {
            // We have found the last node
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }

    }

    @Override
    public void remove(T data) {

        if (root == null)
            return;

        // We want to remove the first node (root)
        if (root.getData().compareTo(data) == 0)
            root = root.getNextNode();
        else
            remove(data, root, root.getNextNode());

    }

    private void remove(T data, Node<T> previousNode, Node<T> actualNode) {

        // We have to find the node we want to remove
        while (actualNode != null) {
            // This is the node we want to remove
            if (actualNode.getData().compareTo(data) == 0) {
                // Update references
                numOfItems--;
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public void traverse() {

        if (root == null)
            return;

        Node<T> actualNode = root;

        while (actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }

    }

    @Override
    public int size() {
        return numOfItems;
    }
}
