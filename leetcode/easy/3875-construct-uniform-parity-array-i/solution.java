class Solution {
    public boolean uniformArray(int[] nums1) {
        
        int even = 0;
        int odd = 0;
        
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        
        if(even == nums1.length || odd == nums1.length){
            return true;
        }
        
        return true;
    }
}