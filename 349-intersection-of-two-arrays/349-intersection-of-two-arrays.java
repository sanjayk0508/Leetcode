class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        set1.retainAll(set2);
        
        int[] ans = new int[set1.size()];
        int i = 0;
        
        for (int num : set1) {
            ans[i++] = num;
        }
        
        return ans;
    }
}