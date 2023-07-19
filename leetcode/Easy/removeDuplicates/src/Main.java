import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int removeDuplicates(int[] nums) {

        HashMap<Integer, Integer> hash = new HashMap<>();
        Queue<Integer> fila = new PriorityQueue<>();
        int total = 0;

        for(int i =0; i < nums.length; i++){
            int number = nums[i];
            if(hash.get(number) == null){
                if(!fila.isEmpty()){
                    nums[fila.poll()] = number;
                    fila.offer(i);
                }
                hash.put(number, 1);
                total+=1;
            }
            else{
                fila.offer(i);
                nums[i] = -1;
            }
        }
        return total;
    }
}