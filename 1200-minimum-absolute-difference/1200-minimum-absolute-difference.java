class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList();
        
        int val = 2424;
        for(int i=1; i<arr.length; i++){
            val = Math.min(arr[i]-arr[i-1], val);
        }
        
        for(int i=1; i<arr.length; i++){
            
            if(arr[i]-arr[i-1] == val){
                List<Integer> pair = new ArrayList();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                result.add(pair);
                
            }
        }
        return result;
        
    }
}