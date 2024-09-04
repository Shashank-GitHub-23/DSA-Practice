class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] arr = new int[26];

        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            arr[ch-'a']--;
        }
        int n = arr.length;
        for(int i : arr){
            if( i != 0){
                return false;
            }
        }
        return true;
    }
}