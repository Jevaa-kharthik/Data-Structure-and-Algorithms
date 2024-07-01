import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum{
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int iden = 0;
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            iden = target - nums[i];
            if(!map.containsKey(iden)){
               map.put(nums[i], i); 
            }
            else if(map.containsKey(iden)){
                arr[0] = map.get(iden);
                arr[1] = i;
                break;
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {11, 3, 7, 9, 14, 2};
        int target = 17;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}