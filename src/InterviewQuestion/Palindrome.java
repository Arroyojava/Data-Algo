package InterviewQuestion;

public class Palindrome {
    public static void main(String[] args) {

        /*
            "A palindrome is a string that reads the same forward and backward"
            For example: radar or madam
            Your task is to design an optimal algorithm for checking whether a given string is palindrome or not!
         */

        String word = "carshop";
        String word2 = "racecar";
        System.out.println(isPalindrome(word));
        System.out.println(isPalindrome(word2));

        System.out.println(solve(word));
        System.out.println(solve(word2));


    }

    // It has O(n) linear running time complexity
    public static boolean solve(String s) {
        int forward = 0;
        int backward = s.length() - 1;
        while (forward < backward) {
            if (s.charAt(forward) != s.charAt(backward))
                return false;
            forward++;
            backward--;
        }

        return true;
    }

    public static boolean isPalindrome(String s) {

        String newS = String.valueOf(reverseString(s));
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != newS.charAt(i))
                return false;

        return true;
    }

    public static StringBuilder reverseString(String s) {

        StringBuilder newWord = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            newWord.append(s.charAt(i - 1));
        }
        return newWord;
    }
}
