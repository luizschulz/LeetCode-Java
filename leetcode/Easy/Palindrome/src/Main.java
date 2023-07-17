import java.lang.*;


class Solution {
    public boolean isPalindrome(int x) {

        String xString = Integer.toString(x);

        for(int i =0; i < (xString.length()/2); i++){
            if(xString.charAt(i) != xString.charAt(xString.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}