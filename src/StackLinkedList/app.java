package StackLinkedList;

public class app {
    public static void main(String[] args) {

        Stack<Integer> names = new Stack<Integer>();

        names.push(1);
        names.push(2);
        names.push(3);
        names.push(4);

        while (!names.isEmpty()){
            System.out.println(names.pop());
        }

    }
}
