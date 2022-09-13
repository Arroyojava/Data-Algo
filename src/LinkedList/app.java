package LinkedList;

public class app {
    public static void main(String[] args) {

        LinkedList<Person> people = new LinkedList<Person>();

        Person p = new Person(23, "Adam");

        people.insert(p);
        people.insert(new Person(34, "Daniel"));
        people.insert(new Person(56, "Michael"));

        people.remove(p);
        people.traverse();

    }
}
