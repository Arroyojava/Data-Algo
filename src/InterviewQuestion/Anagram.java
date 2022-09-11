package InterviewQuestion;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        /*
            Your task is to construct an algorithm to check whether two words (or phrases) are anagrams or not!
            "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
            typically using all the original letters exactly once"
            For example: restful and fluster are anagrams.
         */

        System.out.println(solve("Adam".toCharArray(), "Daniel".toCharArray()));
        System.out.println(solve("restful".toCharArray(), "fluster".toCharArray()));


    }

    public static boolean solve(char[] s1, char[] s2){

        if(s1.length != s2.length) return  false;

        // sort the letters of the strings
        //O(n log n) this is the bottleneck of the algorithm
        Arrays.sort(s1);
        Arrays.sort(s2);

        // consider all the letters one by one
        // compare the letters
        //O(n) overall running time is O(n log n) + O(n) = O(n log n)
        for(int i = 0; i < s1.length; i++){
            if (s1[i] != s2[i])
                return false;
        }
        return true;
    }
}
