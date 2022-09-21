class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if(letters[n-1]<=target || letters[0] > target){
            return letters[0];
        }
        
        int start = 0;
        int end = n - 1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(letters[mid]<= target){
                start = mid +1 ;
            }
            else {
                end = mid;
            }
        }
        return letters[start];
    }
}