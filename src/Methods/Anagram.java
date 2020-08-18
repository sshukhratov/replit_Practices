package Methods;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("Silent", "l isteno"));

    }

    public static boolean isAnagram(String word1, String word2){
        boolean result = false;

        word1 = word1.toLowerCase().replace(" ", "");
        word2 = word2.toLowerCase().replace(" ", "");

        String[] arr1 = word1.split("");
        String[] arr2 = word2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);


            if (Arrays.equals(arr1, arr2)){
                result = true;
            }


        return result;
    }
}
