import java.util.*;

class Solution {
    public String sortVowels(String s) {
        String vowels = "AEIOUaeiou";
        List<Character> list = new ArrayList<>();
        
        // Step 1: collect vowels
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                list.add(c);
            }
        }
        
        // Step 2: sort vowels
        Collections.sort(list);
        
        // Step 3: put back sorted vowels
        char[] arr = s.toCharArray();
        int k = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (vowels.indexOf(arr[i]) != -1) {
                arr[i] = list.get(k++);
            }
        }
        
        return new String(arr);
    }
}