class Solution {
    public String restoreString(String s, int[] indices) {
        char[] array = new char[indices.length];
        for(int i=0; i<indices.length; i++){
            array[indices[i]] = s.charAt(i);
        }
        return new String(array);
    }
}