package DataAlgo;

import java.util.ArrayList;
import java.util.List;

public class arrays {
    public static void main(String[] args) {

        //ArrayList use standard DataAlgo.arrays under the hood
        // Capacity = 10;
        List<String> names = new ArrayList<>();

        names.add("Kevin");
        names.add("Daniel");
        names.add("Adam");
        names.add("Ana");

        // O(n) for removal of item unless it is the last item
//        names.remove(0);
//        System.out.println(names.get(0));

        System.out.println(names.size());

        for(String name: names)
            System.out.println(name);


        // Arrays are not dynamic structures
        // We have to define the size in advance
        int[] nums = new int[10];

        // Random indexing - we can use the indexes of the array slots
        // O(1)
        for (int i = 0; i < 10; i++) {
            nums[i] = i;
        }

        // We know the index of the item we want to manipulate
        nums[0] = 100;

        // If we do not know the index of the item (search)
        // Linear Search O(n)
        // We want to find the index of item 6
//        for (int i =0; i <10; i++){
//            if ( nums[i] == 6)
//                System.out.println("We have found the item at index " + i);
//        }

//        for (int i =0; i <10; i++){
//            System.out.println(nums[i]);
//        }
    }
}
