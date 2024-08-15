class Solution {
    public int lengthOfLIS(int[] nums) {
        // int[] dp = new int[nums.length];
        // dp[0] = 1;
        List<Integer> ls = new ArrayList<>();
        ls.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > ls.get(ls.size() -1)){
                ls.add(nums[i]);
            }else{
                int index = Collections.binarySearch(ls, nums[i]);


                if(index < 0){
                    index = - (index + 1);
                }
                ls.set(index, nums[i]);
            }
            // int max = 0;
            // for(int j = 0; j < i; j++){
            //     if(nums[i] > nums[j]){
            //         max = Math.max(max, dp[j]);
            //     }
            // }
            // dp[i] = max + 1;
            // lis = Math.max(lis, dp[i]);
        }
        return ls.size();
    }
}
