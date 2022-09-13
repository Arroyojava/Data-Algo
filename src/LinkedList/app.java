package LinkedList;

public class app {
    public static void main(String[] args) {

        LinkedList<Person> people = new LinkedList<Person>();

        // Custome Object
//      Person p = new Person(23, "Adam");

        people.insert(new Person(23, "Adam"));
        people.insert(new Person(34, "Daniel"));
        people.insert(new Person(56, "Michael"));
        people.insert(new Person(56, "Kevin"));


        people.traverse();
        System.out.println();
        people.reverse();
        people.traverse();

    }
}
