package DoublyLinkedList;


import java.util.LinkedList;
import java.util.List;

public class app {
    public static void main(String[] args) {


        LinkedList<String> dll = new LinkedList<>();

        dll.addLast("Kevin");
        dll.addLast("Daniel");
        dll.addLast("Ana");

        dll.removeLast();

        for (String name: dll){
            System.out.println(name);
        }


        doublyLinkedList<String> names = new doublyLinkedList<>();

        names.insert("Adam");
        names.insert("Kevin");
        names.insert("Ana");
        names.insert("Daniel");

//        names.traverseBackward();
//        System.out.println();
//        names.traverseForward();

    }
}
