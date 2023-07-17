import java.util.HashMap;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashMap<String,Integer> hash = new HashMap<>();

        int total = 0;
        for(int i =0; i < words.length; i++) {
            if (hash.get(words[i]) != null) {
                total++;
            }
            else {
                StringBuilder reverseString = new StringBuilder();
                reverseString.append(words[i]);
                reverseString.reverse();
                hash.put(reverseString.toString(), 1);
            }
        }
        return total;
    }
}