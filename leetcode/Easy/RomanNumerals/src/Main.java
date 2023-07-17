import java.util.*;
import java.lang.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        hash.put('I', 1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);

        int size = s.length();
        int total = 0;

        for(int i = 0; i< size; i++){
            if(i < size-1 && hash.get(s.charAt(i)) < hash.get(s.charAt(i+1))){
                total -= hash.get(s.charAt(i));
                total+= hash.get(s.charAt(i+1));
                i++;
            }
            else{
                total+= hash.get(s.charAt(i));
            }
        }
        return total;
    }
}