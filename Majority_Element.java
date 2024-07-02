import java.util.HashMap;

public class Majority_Element {
    public static int majorityElement(int[] nums){
        int Avg = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        int element = -1;
        for(int key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                element = key;
            }
        }
        if(max > Avg){
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,4,7,4,3,4,4,7,4,4,7,4,4};
        System.out.println(majorityElement(nums));
    }
    
}
