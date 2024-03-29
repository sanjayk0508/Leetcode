class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start =0;
        int end = nums.length - 1;
        int mid;
        
        //Boundary case
        if(end == 0){
            return nums[0];
        }else if(nums[0] != nums[1]){
            return nums[0];
        }else if (nums[end] != nums[end-1]){
            return nums[end];
        }
        
        while(start <= end){
            mid = start + (end-start)/2;
            
            //Unique element / Mid element
            if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            
            // Checking if(Even) mid == mid+1 & nums(mid) == nums(mid+1) OR 
            // (Odd)mid == mid-1 & nums(mid) == nums(mid-1)
            if(((mid%2)==0 && nums[mid] == nums[mid+1]) || ((mid%2)==1 &&                nums[mid]  == nums[mid-1]))
                start = mid+1;
            else{
                end= mid-1;
            }
            
        }
        return -1;
    }
}