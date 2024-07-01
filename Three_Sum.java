import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    public static List<List<Integer>> threeSum(int[] nums, int target){
        List<List<Integer>> lst1 = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(i == 0 || nums[i] != nums[i - 1]){
                int tar = target - nums[i];
                int j = i + 1, k = n - 1;
                while(j < k){
                    if(nums[j] + nums[k] == tar){
                        List<Integer> single = new ArrayList<>();
                        single.add(nums[i]);
                        single.add(nums[j]);
                        single.add(nums[k]);
                        lst1.add(single);
                        while(j < k && nums[j] == nums[j + 1]) j++;
                        while(j < k && nums[k] == nums[k - 1]) k--;
                        j++;
                        k--;
                    }
                    else if(nums[j] + nums[k] < tar){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }
        return lst1;
    }
    public static void main(String[] args) {
        int[] nums = {7, -6, 3, 8, -1, 8, -11};
        int target = 0;
        System.out.println(threeSum(nums, target));
    }
}
