class Solution {
    public int specialArray(int[] nums) {
        int start = 1 , end = nums.length , count=0;
        while (start<=end){
            int mid = start + (end - start) /2;
            count = numbers(nums , mid);
            if(count<mid) end = mid-1;
            else if(count == mid) return mid;
            else start = mid+1;
        }
        return -1;
    }
    public int numbers(int [] nums , int target){
        int count = 0;
        for (int ele : nums){
            if(ele >= target) count++;
        }
        return count ; 
    }  
    }
    
